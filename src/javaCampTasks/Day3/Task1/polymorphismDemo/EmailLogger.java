package javaCampTasks.Day3.Task1.polymorphismDemo;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Email Logger: " + message);
    }
}
