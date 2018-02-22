package restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created on 2/20/2018.
 */
@Path("/")
public interface UserService {
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("show")
    User show();

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("test")
    String test();
}
