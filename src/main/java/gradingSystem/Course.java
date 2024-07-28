package gradingSystem;

public class Course {
    private int id;
    private String courseName;
    private int courseYear;

    public Course(int id, String courseName,int courseYear){
        this.id = id;
        this.courseName = courseName;
        this.courseYear = courseYear;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
