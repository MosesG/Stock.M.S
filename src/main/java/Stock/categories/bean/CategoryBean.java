package Stock.categories.bean;

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

import Stock.categories.dao.CategoryDaoI;
import Stock.categories.model.Category;
import Stock.departments.model.Department;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CategoryBean implements CategoryBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private CategoryDaoI CategoryDao;
	
	@PostConstruct
	public void init(){
		CategoryDao.setEm(em);
	}
	
	public void add(Category categories){
		if(categories == null || categories.getCat_Code() == null)
			return;
		
		if(categories.getCat_Dept() != null)
			categories.setDepatments(em.find(Department.class, 
					categories.getCat_Dept()));
		
		categories = CategoryDao.save(categories);
		
	}
	
	
	public String listInJson(){
		Map<String, Object> filter = new HashMap<String, Object>();
		
		List<Category>categories = CategoryDao.list(filter);
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = CategoryDao.countAll();
		for(Category category : categories){
			sb.append(category.getJson());
			
			count --;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public List<Category> list(){
		return CategoryDao.list(new Category());
	}
	
	public boolean delete(Long id){
		CategoryDao.delete(id);
		
		return true;
	}
	
	
	public String load(long id){
		Category categories = CategoryDao.findById(id);
		
		if(categories != null)
			return categories.getJson();
		else
			return "{}";
	}

	public String listfilter(Long id) {
		List<Category> categories = CategoryDao.list(id);
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		int count = CategoryDao.countAll();
		for(Category category : categories){
			sb.append(category.getJson());
			
			count --;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}

}
