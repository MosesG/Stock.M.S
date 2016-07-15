package Stock.users.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Stock.users.dao.UserDaoI;
import Stock.users.model.Users;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UserBean {
	
	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private UserDaoI UserDao;
	
	@PostConstruct
	public void init(){
		
		UserDao.setEm(em);
	}
	
	public void add(Users users){
		if(users == null || users.getUser_Name() == null)
			return;
		
		users = UserDao.save(users);
		
	}
	
	public String load(int id){
		Users users = UserDao.findById(id);
		
		if(users != null)
			return users.getJson();
		else
			return "{}";
	}
	
	public String listInJson(){
		Map<String, Object> filter = new HashMap<String, Object>();
		
		List<Users> users = UserDao.list(filter);
		StringBuilder sb  = new StringBuilder();
		sb.append("[");
		
		int count = UserDao.countAll();
		for(Users user : users){
			sb.append(user.getJson());
			
			count--;
			
			if(count >= 1)
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public List<Users> list() {
		return UserDao.list(new Users());
	}
	
	public boolean delete(int id){
		UserDao.delete(id);
		
		return true;
	}
	
}
