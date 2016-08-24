package Stock.users.bean;

import java.util.List;

import Stock.users.model.Users;

public interface UserBeanI {
	
	void add(Users users);
	
	List<Users> list();
	
	boolean delete (Long userid);
	
	String listInJson();
	
	String load(long l);

	boolean loginStatus (String email, String password);

	public String userstatus(String email, String password);

}
