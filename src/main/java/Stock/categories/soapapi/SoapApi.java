package Stock.categories.soapapi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;


import Stock.categories.bean.CategoryBeanI;
import Stock.categories.model.Category;

public class SoapApi {
	
	@EJB	
	private CategoryBeanI CategoryBean;
	
	@WebMethod
	public List<Category> list() {
		return CategoryBean.list();
	}
	
	@WebMethod
	public Category load(){
		List<Category> category = CategoryBean.list();
		if(category.isEmpty())
			return new Category();
		else
			return category.get(0);
}
	

}
