package restService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/26/2018.
 */
public class Users {
    private int counter;
    private List<User> users;

    public Users() {
        this.counter = 0;
        this.users = new ArrayList<User>();
        users.add(new User(counter, "Janusz"));
    }

    public void addUser(String name) {
        users.add(new User(counter,name));
        counter++;
    }

    public User getUser(String name) {
        for (User user: users) {
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public User getUserById(int id) {
        return users.get(id);
    }
}
