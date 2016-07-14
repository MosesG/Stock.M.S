package Stock.users.bean;

import java.util.List;

import Stock.users.model.Users;

public interface UserBeanI {
	
	void add(Users users);
	
	List<Users> list();
	
	boolean delete (int id);
	
	String listInJson();
	
	String load(int id);
}
