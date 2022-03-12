package javaCampTasks.Day4.Task2.abstracts;

import javaCampTasks.Day4.Task2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    public void save(Customer customer){
        System.out.println("Saved to Database: "+ customer.getFirstName());
    }
}
