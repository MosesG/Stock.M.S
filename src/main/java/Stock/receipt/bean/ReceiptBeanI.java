package Stock.receipt.bean;

import java.util.List;

import Stock.receipt.model.Receipt;

public interface ReceiptBeanI {
	
void add(Receipt receipts);
	
	List<Receipt> list();
	
	boolean delete (Long receiptid);
	
	String listInJson();
	
	String load(long l);

}
