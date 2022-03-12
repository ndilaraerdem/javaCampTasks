package javaCampTasks.Day5;

import javaCampTasks.Day5.Business.concretes.CustomerManager;
import javaCampTasks.Day5.Business.concretes.RegisterCheckManager;
import javaCampTasks.Day5.Business.concretes.VerificationManager;
import javaCampTasks.Day5.Entities.concretes.Customer;
import javaCampTasks.Day5.DataAccess.concretes.HibernateCustomerDao;

public class Main {
    //Aşağıda bir e-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim
    // ve kabul kriterlerini yazdım. Bu sisteme ait Java backend yazmak istiyoruz.
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "ndilaraerdem@gmail.com","3232423442","Dilara","Erdem");
        CustomerManager customerManager = new CustomerManager(new RegisterCheckManager(), new VerificationManager(), new HibernateCustomerDao());
        customerManager.register(customer1);


    }
}
