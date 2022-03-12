package javaCampTasks.Day2.Task2;

public class Main {
    public static void main(String[] args) {
        /*
        https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25

        Bu oynatma listesini 24-35 aralığında izleyiniz. (24-35 dahil)

        Bu dersler sizi sonraki derse hazır getirecek.

        Bu videoları siz de uygulayınız.
*/
        System.out.println("-----------------METHODLAR----------------");
        findNumber();
        System.out.println("-----------------VARIABLE ARGUMENTS----------------");
        System.out.println(sub(1, 2, 3, 4, 70, 45, 89));
        System.out.println("-----------------CLASSLAR----------------");
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.delete();
        customerManager.update();
        System.out.println("-----------------RECAP DEMO CLASSES----------------");
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(12, 2));
        ;
        dortIslem.carpma(5, 6);
        dortIslem.bolme(10, 2);

        System.out.println("-----------------CLASS WITH ATTRIBUTES----------------");
        Product product = new Product();
        product.name = "Laptop";
        System.out.println(product.name);
        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }






    public static void findNumber() {
        boolean control = false;
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 9};
        int aranacak = 9;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                control = true;
                break;
            }
        }
        if (control) {
            message(aranacak);
        } else {
            System.out.println("Sayi yok.");
        }


    }

    public static void message(int aranacak) {
        System.out.println("Sayı mevcut : " + aranacak);
    }

    public static int sub(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum;
    }
}
