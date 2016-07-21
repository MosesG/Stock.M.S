package Stock.sales.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.sales.bean.SalesBeanI;
import Stock.sales.model.Sales;

@WebServlet("/sales/*")
public class SalesAction extends HttpServlet {
	
private static final long serialVersionUID = 1L;
	
	@EJB
	private SalesBeanI SalesBean;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String [] pathCmp = request.getRequestURI().split("/");
		String path = pathCmp[pathCmp.length-1];
		
		if(path.equalsIgnoreCase("load"))
			this.load(request, response);
		else
			this.list(response);
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Sales sale = new Sales();

		sale.setProd_Id(Long.parseLong(req.getParameter("prod_Id")));
		sale.setSale_Price(Double.parseDouble(req.getParameter("sale_Price")));
		sale.setSale_Quantity(Integer.parseInt(req.getParameter("sale_Quantity")));
		
		SalesBean.add(sale);

	}

	private void list(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(SalesBean.listInJson());
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long saleid = Long.parseLong(request.getParameter("id"));
		SalesBean.delete(saleid);
	}
	
	private void load(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		PrintWriter resp = response.getWriter();
        resp.println(SalesBean.load(Long.parseLong(request.getParameter("id"))));
	}
	 

}
