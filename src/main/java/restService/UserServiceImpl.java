package restService;

/**
 * Created on 2/20/2018.
 */
public class UserServiceImpl implements UserService{

    public User show() {
        return new User(1,"Java Master");
    }

    public String test() {
        return "I am Alive!";
    }
}
