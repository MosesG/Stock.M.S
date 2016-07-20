package Stock.products.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Stock.products.dao.ProductDaoI;
import Stock.products.model.Product;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ProductBean implements ProductBeanI {
	
	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private ProductDaoI ProductDao;
	
	@PostConstruct
	public void init(){
		
		ProductDao.setEm(em);
	}
	
	public void add(Product products){
		if(products == null || products.getProd_Name() == null)
			return;
		
		products = ProductDao.save(products);
		
	}
	
	
	public String listInJson(){
		Map<String, Object> filter = new HashMap<String, Object>();
		
		List<Product> products = ProductDao.list(filter);
		StringBuilder sb  = new StringBuilder();
		sb.append("[");
		
		int count = ProductDao.countAll();
		for(Product product : products){
			sb.append(product.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public List<Product> list() {
		return ProductDao.list(new Product());
	}

	public boolean delete(Long id) {
		ProductDao.delete(id);
		
		return true;
	}

	public String load(long id) {
		Product products = ProductDao.findById(id);
		
		if(products != null)
			return products.getJson();
		else
			return "{}";
	}
	

}
