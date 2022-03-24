package itmo.ws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    private int uid;
    private String name;
    private int age;
    private String eyes_color;
    private String fur_color;
    private String breed;
    private String owner_name;
}
