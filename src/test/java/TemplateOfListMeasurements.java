import java.util.ArrayList;

public class TemplateOfListMeasurements {
    private Integer id;
    private String name;
    private String description;
    private String ownerLogin;
    private Long lastEditDate;
    private ArrayList<String> tags;

    public TemplateOfListMeasurements(Integer id, String name, String description, String ownerLogin, Long lastEditDate, ArrayList<String> tags) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerLogin = ownerLogin;
        this.lastEditDate = lastEditDate;
        this.tags = tags;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public Long getLastEditDate() {
        return lastEditDate;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
}

