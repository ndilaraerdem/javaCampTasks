package javaCampTasks.Day2.Task1;

public class CourseManager {
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Eklendi.");
    }

    public Course[] getAll() {
        Course course1 = new Course();
        return new Course[]{course1};
    }
}
