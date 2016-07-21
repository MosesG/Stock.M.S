package Stock.categories.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.categories.bean.CategoryBeanI;
import Stock.categories.model.Category;

@WebServlet("/category")
public class CategoryAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CategoryBeanI CategoryBean;
	
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
		Category categories = new Category();

		categories.setCat_Code(req.getParameter("cat_Code"));
		categories.setCat_Name(req.getParameter("cat_Name"));
		categories.setCat_Desc(req.getParameter("cat_Desc"));

		CategoryBean.add(categories);
	}

	private void list(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(CategoryBean.listInJson());
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long id = Long.parseLong(request.getParameter("id"));
		CategoryBean.delete(id);
	}

	private void load(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		PrintWriter resp = response.getWriter();
        resp.println(CategoryBean.load(Long.parseLong(request.getParameter("id"))));
	}
	 
}
