package restService;

import java.util.List;

/**
 * Created on 2/20/2018.
 */
public class UserServiceImpl implements UserService{
    private Users users = new Users();

    public User show() {
        System.out.println("Show method");
        return new User(1,"Java Master");
    }

    public void addUser(String name) {
        System.out.println("Add user method call || name: " + name);
        users.addUser(name);
    }

    public User getUser(String name) {
        System.out.println("Get User with name || name: " + name);
        return users.getUser(name);
    }

    public User getUserById(int id) {
        System.out.println("Get User by id || id: " + id);
        return users.getUserById(id);
    }

    public List<User> getAll() {
        return users.getUsers();
    }

    public void updateUser(int id, String name) {
        System.out.println("User updated");
        users.updateUser(id, name);
    }

    public void deleteUser(int id) {
        System.out.println("User deleted");
        users.deleteUser(id);
    }
}
