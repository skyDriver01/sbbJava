package annotation.aufg1;


import lombok.Data;

@Documentation(name = "Fred",description = "Made 1 Book", version = "0.0.2")
@Data
public class Publisher {
    private String name;
    private String description;
    private String version;
}