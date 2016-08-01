package Stock.users.bean;

import java.util.List;

import Stock.users.model.Users;

public interface UserBeanI {
	
	void add(Users users);
	
	List<Users> list();
	
	boolean delete (Long userid);
	
	String listInJson();
	
	String load(long l);

	Boolean login(String username, String password);
}
