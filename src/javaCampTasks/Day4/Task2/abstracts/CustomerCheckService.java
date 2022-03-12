package javaCampTasks.Day4.Task2.abstracts;

import javaCampTasks.Day4.Task2.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
