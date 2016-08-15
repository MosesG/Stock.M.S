package Stock.sales.action;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.sales.bean.SalesBeanI;
import Stock.sales.model.Sales;

@WebServlet("/purchase/*")
public class PurchaseAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private SalesBeanI SalesBean;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Sales sale = new Sales();

		sale.setProd_Id(Long.parseLong(req.getParameter("Prod_Id")));
		sale.setSale_Price(Double.parseDouble(req.getParameter("Sale_Price")));
		sale.setSale_Quantity(Integer.parseInt(req.getParameter("Sale_Quantity")));
		
		SalesBean.add(sale);

	}


}
