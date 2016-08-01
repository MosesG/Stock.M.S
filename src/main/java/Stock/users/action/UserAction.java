package Stock.users.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.users.bean.UserBeanI;
import Stock.users.model.Users;



@WebServlet("/user/*")
public class UserAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserBeanI UserBean;
	
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
		Users user = new Users();
		
		if(req.getParameter("id") != null 
				&& !req.getParameter("id").equals("undefined"))
			user.setId(Long.parseLong(req.getParameter("id")));

		
		user.setUser_Name(req.getParameter("User_Name"));
		user.setUser_Password(req.getParameter("User_Password"));
		user.setUser_Email(req.getParameter("User_Email"));
		user.setUser_PhoneNo(req.getParameter("User_PhoneNo"));
		user.setUser_Box(req.getParameter("User_Box"));

		UserBean.add(user);
		
	}

	private void list(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(UserBean.listInJson());
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long id = Long.parseLong(request.getParameter("id"));
		UserBean.delete(id);
	}
	
	private void load(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		PrintWriter resp = response.getWriter();
        resp.println(UserBean.load(Long.parseLong(request.getParameter("id"))));
	}
	 
}
