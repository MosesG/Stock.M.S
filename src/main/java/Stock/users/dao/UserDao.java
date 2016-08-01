package Stock.users.dao;

import java.util.List;

import javax.persistence.Query;

import Stock.GenericDao.GenericDao;
import Stock.users.model.Users;;

public class UserDao  extends GenericDao<Users, Integer> implements UserDaoI {
	
	public Boolean login(String username, String password) {


		String hql = "FROM Users p WHERE p.User_Name=:username "
				+ "and p.User_Password=:pwd";
		Query query = em.createQuery(hql)
				.setParameter("username", username)
				.setParameter("pwd", password);

		@SuppressWarnings("unchecked")
		List<Users> results = query.getResultList();


		System.out.println(results.isEmpty());

		if (results.isEmpty())
			return false;
		else
			return true;
	}
	

}
