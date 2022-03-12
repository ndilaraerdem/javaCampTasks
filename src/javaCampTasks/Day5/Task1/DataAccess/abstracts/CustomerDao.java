package javaCampTasks.Day5.Task1.DataAccess.abstracts;

import javaCampTasks.Day5.Task1.Entities.concretes.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    List<Customer> getAll();
}
