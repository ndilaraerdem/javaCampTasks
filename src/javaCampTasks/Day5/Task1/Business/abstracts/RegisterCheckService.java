package javaCampTasks.Day5.Task1.Business.abstracts;

import javaCampTasks.Day5.Task1.Entities.concretes.Customer;

public interface RegisterCheckService {
    boolean checkName(Customer customer);
    boolean checkEmail(Customer customer);
    boolean checkPassword(Customer customer);
    boolean check(Customer customer);

}
