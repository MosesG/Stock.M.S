package Stock.categories.dao;

import java.util.List;

import Stock.GenericDao.GenericDaoI;
import Stock.categories.model.Category;
import Stock.departments.model.Department;

public interface CategoryDaoI extends GenericDaoI<Category, Integer> {

	List<Category> list(long filter);

}
