package restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created on 2/20/2018.
 */
@Path("/")
public interface UserService {
    @GET
    @Path("show")
    @Produces("application/json")
    User show();

    @GET
    @Path("test")
    @Produces("application/json")
    String test();
}
