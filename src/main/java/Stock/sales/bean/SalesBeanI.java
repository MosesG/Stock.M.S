package Stock.sales.bean;

import java.util.List;

import Stock.sales.model.Sales;

public interface SalesBeanI {
	
void add(Sales sales);
	
	List<Sales> list();
	
	boolean delete (Long salesid);
	
	String listInJson();
	
	String load(long l);

}
