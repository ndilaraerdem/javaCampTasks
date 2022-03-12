package javaCampTasks.Day5.Task1.Business.concretes;

import javaCampTasks.Day5.Task1.Business.abstracts.RegisterCheckService;
import javaCampTasks.Day5.Task1.DataAccess.abstracts.CustomerDao;
import javaCampTasks.Day5.Task1.DataAccess.concretes.HibernateCustomerDao;
import javaCampTasks.Day5.Task1.Entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegisterCheckManager implements RegisterCheckService {
    CustomerDao customerDao = new HibernateCustomerDao();
    List<Customer> emails = customerDao.getAll();
    boolean flag = true;

    @Override
    public boolean checkName(Customer customer) {
        if (customer.getFirstName().length() < 2 || customer.getLastName().length() < 2){
            System.out.println("Adınızı ve Soyadınızı eksiksiz giriniz.");
            flag=false;
        }
        return flag;
    }

    @Override
    public boolean checkEmail(Customer customer) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        if (customer.getEmail().isEmpty() || !pattern.matcher(customer.getEmail()).find() ) {
            System.out.println("Email'i boş veya yanlış girdiniz!");
            flag = false;
        }
        else{
        for (Customer item : emails) {
            if (item.getEmail().equalsIgnoreCase(customer.getEmail())) {
                flag=false;
                break;
            }
        }
        if(!flag){
            System.out.println( customer.getEmail() + " zaten var!");
        }
        else{
            emails.add(customer);
        }
        }

        return flag;
    }

    @Override
    public boolean checkPassword(Customer customer) {
        if (customer.getPassword().isEmpty() || customer.getPassword().length() < 6){
            System.out.println("Şifreniz en az 6 haneli olmalıdır!");
            flag=false;
        }
        return flag;
    }

    @Override
    public boolean check(Customer customer) {
        return checkName(customer) && checkEmail(customer) && checkPassword(customer);
    }
}
