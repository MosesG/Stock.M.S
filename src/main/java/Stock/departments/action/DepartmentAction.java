package Stock.departments.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.departments.bean.DepartmentBeanI;
import Stock.departments.model.Department;

@WebServlet("/department/*")
public class DepartmentAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private DepartmentBeanI DepartmentBean;
	
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
		Department department = new Department();
		
		if(req.getParameter("id") != null 
				&& !req.getParameter("id").equals("undefined"))
			department.setId(Long.parseLong(req.getParameter("id")));

		department.setDept_Code(req.getParameter("Dept_Code"));
		department.setDept_Name(req.getParameter("Dept_Name"));
		department.setDept_Desc(req.getParameter("Dept_Desc"));

		DepartmentBean.add(department);

	}
	
	private void list(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(DepartmentBean.listInJson());
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long deptid = Long.parseLong(request.getParameter("id"));
		DepartmentBean.delete(deptid);
	}
	
	private void load(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		PrintWriter resp = response.getWriter();
        resp.println(DepartmentBean.load(Long.parseLong(request.getParameter("id"))));
	}

}
