package Stock.categories.bean;

import java.util.List;

import Stock.categories.model.Category;

public interface CategoryBeanI {
	
void add(Category categories);
	
	List<Category> list();
	
	boolean delete (Long categoriesid);
	
	String listInJson();
	
	String load(long l);

	String listfilter(Long id);

}
