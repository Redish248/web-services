package itmo.rs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Cat {
    private int uid;
    private String name;
    private int age;
    @JsonProperty("eyes_color")
    private String eyesColor;
    @JsonProperty("fur_color")
    private String furColor;
    private String breed;
    @JsonProperty("owner_name")
    private String ownerName;
}
