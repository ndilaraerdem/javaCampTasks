package javaCampTasks.Day3.Task1.polymorphismDemo;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("File Logger: " + message);
    }
}
