package restService;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created on 2/22/2018.
 */
@XmlRootElement()
public class Message {
    @XmlElement()
    private String message = "I'm Alive!";
}
