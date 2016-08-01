package Stock.categories.restapi;


import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Stock.categories.bean.CategoryBeanI;


@Path("/category")
public class RestApi {
	
	@EJB	
	private CategoryBeanI CategoryBean;
	
	
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response list(){
		
		return Response.ok().entity(CategoryBean.list()).build();
		
	}

}
