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

@WebServlet("/category/*")
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
		
		else if(path.equalsIgnoreCase("filter"))
			this.listfiter(response, request);
		
		else
			this.list(response);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Category categories = new Category();
		
		if(req.getParameter("id") != null 
				&& !req.getParameter("id").equals("undefined"))
			categories.setId(Long.parseLong(req.getParameter("id")));


		categories.setCat_Code(req.getParameter("Cat_Code"));
		categories.setCat_Name(req.getParameter("Cat_Name"));
		categories.setCat_Desc(req.getParameter("Cat_Desc"));
		categories.setCat_Dept(Long.parseLong(req.getParameter("Cat_Dept")));
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
	
	public void listfiter(HttpServletResponse response, HttpServletRequest request) 
			throws ServletException, IOException{
		PrintWriter responses = response.getWriter();
		
		responses.println(CategoryBean.listfilter(Long.parseLong(request.getParameter("id"))));
	}

	private void load(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		PrintWriter resp = response.getWriter();
        resp.println(CategoryBean.load(Long.parseLong(request.getParameter("id"))));
	}
	 
}
