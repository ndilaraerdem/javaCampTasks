package javaCampTasks.Day5.Business.abstracts;

import javaCampTasks.Day5.Entities.concretes.Customer;

public interface CustomerService {
    void register(Customer customer);
    void login(Customer customer);
}
