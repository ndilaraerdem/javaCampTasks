package javaCampTasks.Day1.Task3;

public class Main {
    public static void main(String[] args) {
        /*
        Aşağıdaki oynatma listesinde 5-23 arasındaki dersleri izleyiniz ve uygulayınız. (5,23 Dahil)

        https://www.youtube.com/watch?v=dtP6yK50xIs&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=6
*/
        //HELLO WORLD
        System.out.println("----------HELLO WORLD----------------");
        System.out.println("Hello World");
        System.out.println("Merhaba Dünya");
        System.out.println("-----------VARIABLES---------------");
        //VARIABLES
        int number = 10;
        String message = "Öğrenci Sayısı: ";
        System.out.println(message + number);
        System.out.println("------------DATA TYPES--------------");
        double num = 12.5;
        int intnum = -129;
        char ch = 'A';
        System.out.println(num);
        System.out.println(intnum);
        System.out.println(ch);
        System.out.println("------------CONDITIONALS--------------");
        int number1 = 25;
        if (number1 > 20) {
            System.out.println("Sayı 20'den büyüktür");
        } else if (number1 == 20) {
            System.out.println("Sayı 20'ye eşittir.");
        } else {
            System.out.println("Sayı 20'den küçüktür");
        }
        System.out.println("------------RECAP DEMO--------------");
        int sayi1 = 56;
        int sayi2 = 25;
        int sayi3 = 79;
        int biggest = sayi1;

        if (biggest < sayi2) {
            biggest = sayi2;
        } else if (biggest < sayi3) {
            biggest = sayi3;
        }
        System.out.println("En büyük : " + biggest);
        System.out.println("------------SWITCH CASE DEMO--------------");

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        System.out.println("------------LOOP DEMO--------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.println("LOOP DONE");
        System.out.println("Tek Sayılar");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);

        }
        System.out.println("While Loop");
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("Do-While Loop");
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("-----------ARRAYS DEMO--------------");

        String[] students = new String[]{"Dilara", "Ali", "Ayşe", "Fatma", "Betül"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Foreach ile print");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("-----------RECAP DEMO 2--------------");
        double[] myList = {1, 2.5, 4.6, 3.7, 7};
        double total = 0;
        double max = myList[0];
        for (double sayi : myList) {
            if (max < sayi) {
                max = sayi;
            }
            total = total + sayi;
            System.out.println(sayi);
        }
        System.out.println("TOTAL: " + total);
        System.out.println("Max : " + max);
        System.out.println("-----------MULTI DIMENSIONAL DEMO --------------");
        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------");
            for (int k = 0; k < 3; k++) {
                System.out.println(cities[i][k]);
            }
        }
        System.out.println("-----------ASAL SAYI DEMO --------------");

        int nmbr = 71;
        boolean flag = false;
        for (int i = 2; i < nmbr; ++i) {
            if (nmbr % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(nmbr + " is a prime number.");
        else
            System.out.println(nmbr + " is not a prime number.");

        System.out.println("-----------ASAL SAYI DEMO --------------");

    }


}
