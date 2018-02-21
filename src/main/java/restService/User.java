package restService;

import lombok.Getter;

/**
 * Created on 2/20/2018.
 */
@Getter
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
