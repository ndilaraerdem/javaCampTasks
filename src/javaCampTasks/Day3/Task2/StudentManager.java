package javaCampTasks.Day3.Task2;

public class StudentManager extends UserManager {

    @Override
    public void add(User user) {
        super.add(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public void update(User user) {
        super.update(user);
    }
    public void getCourse(Student student){
        System.out.println(student.getOwnedCourse() + "Kursu alındı.");
    }
}
