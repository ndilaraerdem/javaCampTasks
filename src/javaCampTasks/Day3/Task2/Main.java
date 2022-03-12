package javaCampTasks.Day3.Task2;

public class Main {
    public static void main(String[] args) {
User user1 = new User(1,"ndilaraerdem","3267462","Dilara","ERDEM");
Student user2 = new Student(2,"aliveli","3267789","Ali","Veli","JAVA");
Instructor user3 = new Instructor(3,"aysefastma","ayse4462","Ayşe","Fatma","JAVA");
UserManager userManager = new UserManager();
StudentManager studentManager = new StudentManager();
InstructorManager instructorManager = new InstructorManager();
userManager.add(user1);


    }
    }
