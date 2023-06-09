package Task1;

public class Owner {
    private String name;

    public Owner() {
        setName("");
    }

    public Owner(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) this.name = "none";
        else this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
