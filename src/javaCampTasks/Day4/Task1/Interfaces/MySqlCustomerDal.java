package javaCampTasks.Day4.Task1.Interfaces;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Müşteri eklendi: MYSQL");
    }

}
