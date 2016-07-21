package Stock.departments.bean;

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

import Stock.departments.dao.DepartmentDaoI;
import Stock.departments.model.Department;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DepartmentBean implements DepartmentBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private DepartmentDaoI DepartmentDao;
	
	@PostConstruct
	public void init(){
		
		DepartmentDao.setEm(em);
	}
	
	public void add(Department departments){
		if(departments == null)
			return;
		
		departments = DepartmentDao.save(departments);
		
	}
	
	
	public String listInJson(){
		Map<String, Object> filter = new HashMap<String, Object>();
		
		List<Department> departments = DepartmentDao.list(filter);
		StringBuilder sb  = new StringBuilder();
		sb.append("[");
		
		int count = DepartmentDao.countAll();
		for(Department department : departments){
			sb.append(department.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public List<Department> list() {
		return DepartmentDao.list(new Department());
	}

	public boolean delete(Long id) {
		DepartmentDao.delete(id);
		
		return true;
	}

	public String load(long id) {
		Department departments = DepartmentDao.findById(id);
		
		if(departments != null)
			return departments.getJson();
		else
			return "{}";
	}

}
