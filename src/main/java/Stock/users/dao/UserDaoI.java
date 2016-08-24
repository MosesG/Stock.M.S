package Stock.users.dao;

import Stock.GenericDao.GenericDaoI;
import Stock.users.model.Users;

public interface UserDaoI extends GenericDaoI<Users, Integer> {

	Boolean login (String email, String password);

	String userstatus(String email, String password);

}
