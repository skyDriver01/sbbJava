package annotation;


@Documentation(name = "Fred",description = "Made 1 Book", version = "0.0.2")
public class Book extends DocumentationProcessor {
    private String title;
    private String description;
    private String genre;
    private String releaseDate;
}