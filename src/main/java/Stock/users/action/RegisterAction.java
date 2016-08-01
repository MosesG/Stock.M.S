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

@WebServlet("/register/*")
public class RegisterAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserBeanI UserBean;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Users user = new Users();
		
		String pass = req.getParameter("User_Password");
		String confpass = req.getParameter("User_ConfirmPassword");
		
		if(pass.equals(confpass)){
		user.setUser_Name(req.getParameter("User_Name"));
		user.setUser_Password(req.getParameter("User_Password"));
		user.setUser_Email(req.getParameter("User_Email"));
		user.setUser_PhoneNo(req.getParameter("User_PhoneNo"));
		user.setUser_Box(req.getParameter("User_Box"));

		UserBean.add(user);
		}
		else {
			System.out.println("Passwords do naot match");
			PrintWriter out = resp.getWriter();
			out.println("login.jsp");
		}
	}

}
