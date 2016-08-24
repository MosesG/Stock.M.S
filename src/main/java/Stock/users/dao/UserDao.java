package Stock.users.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import Stock.GenericDao.GenericDao;
import Stock.users.model.Users;

public class UserDao  extends GenericDao<Users, Integer> implements UserDaoI {
	
	public Boolean login(String email, String password) {


		String hql = "FROM Users p WHERE p.User_Email=:email "
				+ "and p.User_Password=:pwd";
		Query query = em.createQuery(hql)
				.setParameter("email", email)
				.setParameter("pwd", password);

		@SuppressWarnings("unchecked")
		List<Users> results = query.getResultList();


		System.out.println(results.isEmpty());

		if (results.isEmpty())
			return false;
		else
			return true;
	}

	public String userstatus(String email, String password) {
		String Userstatus = "";

		String hql = "FROM Users p WHERE p.User_Email=:email "
				+ "and p.User_Password=:pwd";
		Query query = em.createQuery(hql)
				.setParameter("email", email)
				.setParameter("pwd", password);

		List <Users> list = query.getResultList();
		if (list.isEmpty()){
			return null;
		}
		else{
			for (Users p : list){
				Userstatus = p.getUser_Status();
			}
		}
		return Userstatus;

	}
	

}
