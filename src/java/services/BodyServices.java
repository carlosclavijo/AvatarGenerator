
package services;

import com.google.gson.Gson;
import dao.BodyDao;
import dao.BodyDaoJson;
import dto.characteristics.Body;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Carlos
 */
@Path("body")
public class BodyServices {
    
    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String list() {
        Response response = new Response();
        BodyDao dao = new BodyDaoJson();
        List<Body> list = dao.list();
        System.out.println("Sirve?");
        response.setSuccess(true);
        response.setMessage("List of bodies");
        response.setResponse(list);
        return new Gson().toJson(response);
        
    }
    
}
