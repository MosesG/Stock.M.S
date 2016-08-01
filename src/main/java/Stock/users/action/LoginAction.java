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

@WebServlet("/login/*")
public class LoginAction  extends HttpServlet{
	
private static final long serialVersionUID = 1L;
	
	@EJB
	private UserBeanI UserBean;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter resp = response.getWriter();
        resp.println(UserBean.load(Long.parseLong(request.getParameter("name"))));
        System.out.println(UserBean.load(Long.parseLong(request.getParameter("name"))));
	}
	 @Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("email");
	System.out.println("The email is "+ email);
	 }
}
