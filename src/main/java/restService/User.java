package restService;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created on 2/20/2018.
 */
@Getter
@XmlRootElement()
public class User {
    @XmlElement()
    private int id;
    @XmlElement()
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
