package at.fh.bac;

public class Subject {
    //Attribute für das JavaObject "Subject"
    String name;
    String id;

    public Subject(String name, String id) {
        this.name = name;
        this.id = id;


    }

    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
