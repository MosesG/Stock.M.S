package Stock.users.action;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

		String password = req.getParameter("User_Password");
		String hashedPass = "";
		try {
			hashedPass = hashPassword(password);
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}

		user.setUser_Name(req.getParameter("User_Name"));
		user.setUser_Password(hashedPass);
		user.setUser_Email(req.getParameter("User_Email"));
		user.setUser_PhoneNo(req.getParameter("User_PhoneNo"));
		user.setUser_Box(req.getParameter("User_Box"));

		UserBean.add(user);

	}
	public static String hashPassword(String password)throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte [] b = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b1 : b) {
			sb.append(Integer.toHexString(b1 & 0xff).toString());
		}
		return sb.toString();

	}


}
