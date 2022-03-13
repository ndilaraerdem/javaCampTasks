package javaCampTasks.Day4.Task1;

import javaCampTasks.Day4.Task1.AbstractSiniflar.BaseGameCalculator;
import javaCampTasks.Day4.Task1.AbstractSiniflar.WomenCalculator;
import javaCampTasks.Day4.Task1.Interfaces.CustomerManager;
import javaCampTasks.Day4.Task1.Interfaces.ICustomerDal;
import javaCampTasks.Day4.Task1.Interfaces.MySqlCustomerDal;
import javaCampTasks.Day4.Task1.Interfaces.OracleCustomerDal;
import javaCampTasks.Day4.Task1.StaticDemo.Product;
import javaCampTasks.Day4.Task1.StaticDemo.ProductManager;
import javaCampTasks.Day4.Task1.StaticDemo.ProductValidator;

public class Main {
    public static void main(String[] args) {
        /*
        Aşağıdaki oynatma listesini 40-45 aralığında izleyiniz.(40-45 dahil)

        Kendiniz de uygulayınız.

        https://www.youtube.com/watch?v=7PJ6YCX52XA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=41
*/
        System.out.println("-------------ABSTRACT------------------------");
        BaseGameCalculator gameCalculator = new WomenCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
        System.out.println("-------------INTERFACES------------------------");

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
        System.out.println("-------------STATIC DEMO------------------------");
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        ProductValidator.isValid(product);
        productManager.add(product);






    }
}
