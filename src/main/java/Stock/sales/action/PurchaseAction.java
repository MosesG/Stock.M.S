package Stock.sales.action;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

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

		System.out.println("zimekuja");

		Sales sale = new Sales();

		sale.setProd_Name(req.getParameter("Prod_Name"));
		sale.setSale_Price(Double.parseDouble(req.getParameter("Prod_Price")));
		sale.setSale_Quantity(Integer.parseInt(req.getParameter("Sale_Quantity")));
		sale.setSale_Total(Integer.parseInt(req.getParameter("Sale_Total")));
		sale.setSale_Customer(Long.parseLong(req.getParameter("Cust_Phone")));
		DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		sale.setSale_Time(simpleDateFormat.format(date));
		
		SalesBean.add(sale);

	}


}
