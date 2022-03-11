package javaCampTasks.Day2.Task1;

public class Course {
    private int id;
    private String courseName;
    private int instructorId;
    private double price;
    private String description;

    public Course() {
    }

    public Course(int id, String courseName, int instructorId, double price, String description) {
        this.id = id;
        this.courseName = courseName;
        this.instructorId = instructorId;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
