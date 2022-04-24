package FizzBin.infoService.models;

public class Fizzbin {
    private String fizzbin;
    private String name;
    private String description;

    public Fizzbin(String fizzbinId, String name, String description) {
        this.fizzbin = fizzbinId;
        this.name = name;
        this.description = description;
    }

    public String getFizzbin() {
        return fizzbin;
    }

    public void setFizzbin(String fizzbin) {
        this.fizzbin = fizzbin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
