package Stock.receipt.bean;

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

import Stock.receipt.dao.ReceiptDaoI;
import Stock.receipt.model.Receipt;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ReceiptBean implements ReceiptBeanI{
	
	@PersistenceContext
	private EntityManager em;
	
	@Inject 
	private ReceiptDaoI ReceiptDao;
	
	@PostConstruct
	public void add(Receipt receipts){
		if(receipts == null)
			return;
		
		receipts = ReceiptDao.save(receipts);
	}
	
	public String listInJson(){
		Map<String, Object> filter = new HashMap<String, Object>();
		
		List<Receipt> receipts = ReceiptDao.list(filter);
		StringBuilder sb  = new StringBuilder();
		sb.append("[");
		
		int count = ReceiptDao.countAll();
		for(Receipt receipt : receipts){
			sb.append(receipt.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public List<Receipt> list() {
		return ReceiptDao.list(new Receipt());
	}

	public boolean delete(Long id) {
		ReceiptDao.delete(id);
		
		return true;
	}

	public String load(long id) {
		Receipt receipts = ReceiptDao.findById(id);
		
		if(receipts != null)
			return receipts.getJson();
		else
			return "{}";
	}


}
