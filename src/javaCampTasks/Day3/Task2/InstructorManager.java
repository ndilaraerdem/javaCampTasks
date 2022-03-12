package javaCampTasks.Day3.Task2;

public class InstructorManager extends UserManager{
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
    public void addCourse(Instructor instructor){
        System.out.println(instructor.getGivenCourse() +" Kursu Eklendi.");
    }
}
