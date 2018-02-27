package restService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created on 2/20/2018.
 */
@Path("/service")
public interface UserService {
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("show")
    User show();

    @Path("addUser/{name}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    void addUser(@PathParam("name") String name);

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("getUser/{name}")
    User getUser(@PathParam("name") String name);

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("getUserById/{id}")
    User getUserById(@PathParam("id") int id);

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("getAll")
    List<User> getAll();

    @Path("updateUser/{id}/{name}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void updateUser(@PathParam("id") int id, @PathParam("name") String name);

    @Path("deleteUser/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    void deleteUser(@PathParam("id") int id);

}
