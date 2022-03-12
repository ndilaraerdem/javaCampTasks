package javaCampTasks.Day4.Task2.concretes;

import javaCampTasks.Day4.Task2.abstracts.BaseCustomerManager;
import javaCampTasks.Day4.Task2.abstracts.CustomerCheckService;
import javaCampTasks.Day4.Task2.entities.Customer;
import jdk.jshell.spi.ExecutionControl;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
       if (customerCheckService.checkIfRealPerson(customer)){
           super.save(customer);
       }
       else{
           throw new RuntimeException("Not a valid person!");
       }
    }

}
