package Stock.categories.dao;


import java.util.List;

import Stock.GenericDao.GenericDao;
import Stock.categories.model.Category;
import Stock.departments.model.Department;

public class CategoryDao extends GenericDao<Category, Integer> implements CategoryDaoI {
	
	public List<Category> list(long filter){
		
		String Dep_cat = "from Category c where c.depatments.id=:catDept" ;
		@SuppressWarnings("unchecked")
		List<Category> dept = em.createQuery(Dep_cat).setParameter("catDept", filter).getResultList();
		
		return dept;
		
	}

}
