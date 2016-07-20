package Stock.departments.bean;

import java.util.List;

import Stock.departments.model.Department;

public interface DepartmentBeanI {
	
	void add(Department department);
	
	List<Department> list();
	
	boolean delete (Long departmentid);
	
	String listInJson();
	
	String load(long l);


}
