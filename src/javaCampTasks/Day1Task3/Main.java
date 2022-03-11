package javaCampTasks.Day1Task3;

public class Main {
    public static void main(String[] args) {
        //HELLO WORLD
        System.out.println("----------HELLO WORLD----------------");
        System.out.println("Hello World");
        System.out.println("Merhaba Dünya");
        System.out.println("-----------VARIABLES---------------");
        //VARIABLES
        int number=10;
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
        if (number1>20){
            System.out.println("Sayı 20'den büyüktür");
        }
        else if(number1 == 20){
            System.out.println("Sayı 20'ye eşittir.");
        }
        else {
            System.out.println("Sayı 20'den küçüktür");
        }
        System.out.println("------------RECAP DEMO--------------");
    int sayi1 = 56;
    int sayi2 = 25;
    int sayi3 =79;
    int biggest = sayi1;

    if(biggest < sayi2){
        biggest = sayi2;
    }
    else if (biggest < sayi3){
        biggest = sayi3;
    }
    System.out.println("En büyük : "+ biggest);
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
    }

}
