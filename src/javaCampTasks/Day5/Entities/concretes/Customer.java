package javaCampTasks.Day5.Entities.concretes;

import javaCampTasks.Day5.Entities.abstracts.User;

public class Customer extends User {
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(int id, String email, String password, String firstName, String lastName) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
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
}
