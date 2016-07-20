package Stock.products.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.products.bean.ProductBeanI;
import Stock.products.model.Product;

@WebServlet("/product")
public class ProductAction extends HttpServlet{
	
private static final long serialVersionUID = 1L;
	
	@EJB
	private ProductBeanI ProductBean;
	
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
		Product product = new Product();

		product.setProd_Cat(Long.parseLong(req.getParameter("Prod_Cat")));
		product.setProd_Code(req.getParameter("prod_Code"));
		product.setProd_Name(req.getParameter("prod_Name"));
		product.setProd_Price(Double.parseDouble(req.getParameter("prod_Price")));
		
		ProductBean.add(product);

	}

	private void list(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(ProductBean.listInJson());
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long id = Long.parseLong(request.getParameter("id"));
		ProductBean.delete(id);
	}
	
	private void load(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		PrintWriter resp = response.getWriter();
        resp.println(ProductBean.load(Long.parseLong(request.getParameter("id"))));
	}
	 

}
