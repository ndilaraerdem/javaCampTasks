package javaCampTasks.Day5.Business.abstracts;

import javaCampTasks.Day5.Entities.concretes.Customer;

public interface RegisterCheckService {
    boolean checkName(Customer customer);
    boolean checkEmail(Customer customer);
    boolean checkPassword(Customer customer);
    boolean check(Customer customer);

}
