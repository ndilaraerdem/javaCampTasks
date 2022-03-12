package javaCampTasks.Day5.Task1.Api;

import javaCampTasks.Day5.Task1.Business.concretes.CustomerManager;
import javaCampTasks.Day5.Task1.Business.concretes.RegisterCheckManager;
import javaCampTasks.Day5.Task1.Business.concretes.VerificationManager;
import javaCampTasks.Day5.Task1.DataAccess.concretes.HibernateCustomerDao;
import javaCampTasks.Day5.Task1.Entities.concretes.Customer;

public class Main {
    //Aşağıda bir e-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim
    // ve kabul kriterlerini yazdım. Bu sisteme ait Java backend yazmak istiyoruz.
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "ndilaraerdem@gmail.com","3232423442","Dilara","Erdem");
        CustomerManager customerManager = new CustomerManager(new RegisterCheckManager(), new VerificationManager(), new HibernateCustomerDao());
        customerManager.register(customer1);


    }
}
