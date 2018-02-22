package restService;

/**
 * Created on 2/20/2018.
 */
public class UserServiceImpl implements UserService{

    public User show() {
        User user = new User(1,"Java Master");
        return user;
    }

    public String test() {
        return "I am Alive!";
    }
}
