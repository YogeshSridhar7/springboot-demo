package gradingSystem;

public class CumulativeMarks {
    private int studentID;
    private int subjectID;
    private int courseID;
    private int subjectMarks;
    private String result;

    public CumulativeMarks(int studentID, int subjectID, int courseID, int subjectMarks) {
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.courseID = courseID;
        this.subjectMarks = subjectMarks;
//        this.result = result;
    }

    public int getStudentID() {return studentID;}

    public void setStudentID(int studentID) {this.studentID = studentID;}

    public int getSubjectID() {return subjectID;}

    public void setSubjectID(int subjectID) {this.subjectID = subjectID;}

    public int getCourseID() {return courseID;}

    public void setCourseID(int courseID) {this.courseID = courseID;}

    public int getSubjectMarks() {return subjectMarks;}

    public void setSubjectMarks(int subjectMarks) {this.subjectMarks = subjectMarks;}

    public String getResult() {return result;}

    public void setResult(String result) {this.result = result;}

    @Override
    public String toString() {
        return "CumulativeMarks{" +
                "studentID=" + studentID +
                ", subjectID=" + subjectID +
                ", courseID=" + courseID +
                ", subjectMarks=" + subjectMarks +
                ", result='" + result + '\'' +
                '}';
    }
}