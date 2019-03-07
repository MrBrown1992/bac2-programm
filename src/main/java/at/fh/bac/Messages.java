package at.fh.bac;

import java.util.Objects;

public class Messages {

    String name;
    String id;

    public Messages() {
    }

    public Messages(String name, String id) {
        this.name = name;
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Messages)) return false;
        Messages messages = (Messages) o;
        return Objects.equals(name, messages.name) &&
                Objects.equals(id, messages.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return name;

    }
}
