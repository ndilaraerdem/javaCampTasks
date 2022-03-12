package javaCampTasks.Day5.Task1.Business.abstracts;

import javaCampTasks.Day5.Task1.Entities.concretes.Customer;

public interface CustomerService {
    void register(Customer customer);
    void login(Customer customer);
}
