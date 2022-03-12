package javaCampTasks.Day5.DataAccess.concretes;

import javaCampTasks.Day5.DataAccess.abstracts.CustomerDao;
import javaCampTasks.Day5.Entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerDao implements CustomerDao {

    List<Customer> customers = new ArrayList<Customer>();;


    @Override
    public void add(Customer customer) {
        customers.add(customer);
        System.out.println( customer + " Hibernate ile eklendi.");

    }

    @Override
    public void update(Customer customer) {
        System.out.println( customer + " Hibernate ile güncellendi.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println( customer + " Hibernate ile silindi.");
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }
}
