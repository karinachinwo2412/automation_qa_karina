package models;

public class Persona {

    private String name;
    private String lastName;

    public Persona() {
    }

    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String fullName(){
        return name + " " + lastName;
    }
}
