package Stock.products.bean;

import java.util.List;

import Stock.products.model.Product;

public interface ProductBeanI {
	
	void add(Product products);
	
	List<Product> list();
	
	boolean delete (Long prodid);
	
	String listInJson();
	
	String load(long l);
	
}
