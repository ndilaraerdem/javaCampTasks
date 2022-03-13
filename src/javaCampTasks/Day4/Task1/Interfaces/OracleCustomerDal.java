package javaCampTasks.Day4.Task1.Interfaces;

public class OracleCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void add() {
        System.out.println("Müşteri eklendi: ORACLE");
    }

}
