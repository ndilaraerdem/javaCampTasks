package javaCampTasks.Day4.Task2.concretes;

import javaCampTasks.Day4.Task2.abstracts.CustomerCheckService;
import javaCampTasks.Day4.Task2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
