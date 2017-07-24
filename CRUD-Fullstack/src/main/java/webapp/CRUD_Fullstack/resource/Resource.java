package webapp.CRUD_Fullstack.resource;

import java.io.FileWriter;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import webapp.CRUD_Fullstack.service.RestaurantService;


public class Resource {
    RestaurantService service = new RestaurantService();
    POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void putProjects(Restaurant rest) throws IOException {
        
        return service.addProject(rest);
        
        
        
        }

}
