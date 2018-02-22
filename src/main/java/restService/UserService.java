package restService;

import javax.ws.rs.*;
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
    Message test();
}
