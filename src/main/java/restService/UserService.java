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

    @PUT
    @Path("addUser/{name}")
    void addUser(@PathParam("name") String name);

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("getUser/{name}")
    User getUser(@PathParam("name") String name);

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("getUserById/{id}")
    User getUserById(@PathParam("name") int id);
}
