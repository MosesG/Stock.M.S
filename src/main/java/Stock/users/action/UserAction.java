package Stock.users.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Stock.users.bean.UserBeanI;
import Stock.users.model.Users;

@WebServlet("/users")
public class UserAction implements Serializable {
	
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

		user.setUser_Name(req.getParameter("Name"));
		user.setUser_Password(req.getParameter("Password"));
		user.setUser_Email(req.getParameter("Email"));
		user.setUser_PhoneNo(req.getParameter("Phone"));
		user.setUser_Box(req.getParameter("Box"));

		UserBean.add(user);

	}

	private void list(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resp = response.getWriter();
		resp.println(UserBean.listInJson());
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		Long userid = Long.parseLong(request.getParameter("id"));
		UserBean.delete(userid);
	}
	
	private void load(HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException{
		PrintWriter resp = response.getWriter();
        resp.println(UserBean.load(Long.parseLong(request.getParameter("id"))));
	}
	 
}
