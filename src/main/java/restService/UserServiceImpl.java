package restService;

/**
 * Created on 2/20/2018.
 */
public class UserServiceImpl implements UserService{
    private Users users = new Users();

    public User show() {
        return new User(1,"Java Master");
    }

    public Message test() {
        return new Message();
    }

    public void addUser(String name) {
        users.addUser(name);
    }

    public User getUser(String name) {
        return users.getUser(name);
    }

    public User getUserById(int id) {
        return users.getUserById(id);
    }
}
