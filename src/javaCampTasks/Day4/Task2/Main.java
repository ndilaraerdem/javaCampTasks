package javaCampTasks.Day4.Task2;

import javaCampTasks.Day4.Task2.abstracts.BaseCustomerManager;
import javaCampTasks.Day4.Task2.concretes.CustomerCheckManager;
import javaCampTasks.Day4.Task2.concretes.NeroCustomerManager;
import javaCampTasks.Day4.Task2.concretes.StarbucksCustomerManager;
import javaCampTasks.Day4.Task2.entities.Customer;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(new Customer(1,"Dilara","Erdem","1998","2929929292922"));
        BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager1.save(new Customer(1,"Alara","Erdem","1998","2929929292922"));



    }
}
