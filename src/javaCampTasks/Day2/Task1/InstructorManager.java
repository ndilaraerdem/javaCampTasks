package javaCampTasks.Day2.Task1;

public class InstructorManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " Eklendi.");
    }

    public Instructor[] getAll() {
        Instructor instructor1 = new Instructor();
        return new Instructor[]{instructor1};
    }
}
