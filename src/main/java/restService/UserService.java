package restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created on 2/20/2018.
 */
@Path("/")
public interface UserService {
    @GET
    @Path("show")
    User show();
}
