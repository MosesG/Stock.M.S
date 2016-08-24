package Stock.users.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		 String password = req.getParameter("password");

		 String hashedPass = "";

		 try {

			 hashedPass = hashPassword(password);

		 } catch (NoSuchAlgorithmException e1) {

			 e1.printStackTrace();
		 }

		 PrintWriter out = resp.getWriter();

		 boolean login = UserBean.loginStatus(email, hashedPass);

		 String uType = UserBean.userstatus(email, password);
		 try{
			 if (login == true) {

				 if("Admin".equals(uType)){

					 out.println("index.jsp");

				 }
				 else if ("NULL".equals(uType)){

					 out.println("index2.jsp");

				 }

			 }

			 else if (login == false) {

				 out.println("login1.jsp");
			 }
		 }
		 catch (Exception e){

		 }
	 }

	public static String hashPassword(String password)
			throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("MD5");

		md.update(password.getBytes());

		byte[] b = md.digest();

		StringBuffer sb = new StringBuffer();

		for (byte b1 : b) {

			sb.append(Integer.toHexString(b1 & 0xff).toString());

		}

		return sb.toString();

	}


}
