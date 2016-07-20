package Stock.GenericDao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

public interface GenericDaoI<T, ID extends Serializable> {
	
	void setEm(EntityManager em);

	EntityManager getEm();

	T save(T entity);

	List<T> list(T filter);
	
	List<T> list(Map<String, Object> filter);

	void delete(Long id);
	
	T findById(long id);
	
	int countAll();

}
