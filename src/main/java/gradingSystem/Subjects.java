package gradingSystem;

public class Subjects {
    private int id;
    private String subjectName;

    public Subjects(int id, String subjectName){
        this.id = id;
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
