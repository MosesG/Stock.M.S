package Stock.receipt.action;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import Stock.receipt.bean.ReceiptBeanI;

@WebServlet("/receipt")
public class ReceiptAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private ReceiptBeanI ReceiptBean;
	
	
}
