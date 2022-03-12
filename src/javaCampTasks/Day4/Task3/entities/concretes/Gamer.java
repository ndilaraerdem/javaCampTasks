package javaCampTasks.Day4.Task3.entities.concretes;

import javaCampTasks.Day4.Task3.entities.abstracts.Entity;

public class Gamer extends Entity {
    private String username;
    private String firstName;
    private String lastName;
    private String nationalIdentity;

    public Gamer() {
    }

    public Gamer(int id, String username, String firstName, String lastName, String nationalIdentity) {
        super(id);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}
