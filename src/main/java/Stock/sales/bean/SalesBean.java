package Stock.sales.bean;

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

import Stock.sales.dao.SalesDaoI;
import Stock.sales.model.Sales;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SalesBean implements SalesBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private SalesDaoI SalesDao;
	
	@PostConstruct
	public void init(){
		
		SalesDao.setEm(em);
	}
	
	public void add(Sales sales){
		if(sales.getProd_Id() == null)
			return;
		
		sales = SalesDao.save(sales);
		
	}
	
	public String load(long id){
		Sales sales = SalesDao.findById(id);
		
		if(sales != null)
			return sales.getJson();
		else
			return "{}";
	}
	
	public String listInJson(){
		Map<String, Object> filter = new HashMap<String, Object>();
		
		List<Sales> sales = SalesDao.list(filter);
		StringBuilder sb  = new StringBuilder();
		sb.append("[");
		
		int count = SalesDao.countAll();
		for(Sales sale : sales){
			sb.append(sale.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public List<Sales> list() {
		return SalesDao.list(new Sales());
	}
	
	public boolean delete(Long id){
		SalesDao.delete(id);
		
		return true;
	}
}
