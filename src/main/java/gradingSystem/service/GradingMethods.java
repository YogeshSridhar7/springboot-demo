package gradingSystem.service;

import gradingSystem.Course;
import gradingSystem.CumulativeMarks;
import gradingSystem.Student;
import gradingSystem.Subjects;
import gradingSystem.dao.StudentDao;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GradingMethods {
    public static void main(String[] args) {
        GradingMethods gradingMethods = new GradingMethods();
        StudentDao studentDao = new StudentDao();
        studentDao.getStudent();
        List<Student> students = List.of(new Student(1, "Sam", 25, "London","Hounslow","England"),
                                         new Student(2, "Rem", 24, "Dorset","Poole","England"),
                                         new Student(3, "Rae", 24, "London","Hounslow","England"),
                                         new Student(4, "Ria", 25, "Dorset","Poole","England"),
                                         new Student(5, "Zac", 24, "London","Hounslow","England"),
                                         new Student(6, "Jen", 26, "London","Hounslow","England")
        );
        List<Course> courses = List.of(new Course(1,"BTech",1),
                                         new Course(2,"BTech",2),
                                         new Course(3,"BTech",3),
                                         new Course(4,"BE",1),
                                         new Course(5,"BE",2),
                                         new Course(6,"BE",3)
        );
        List<Subjects> subjects = List.of(new Subjects(1,"Maths"),
                                          new Subjects(2,"Thermodynamics"),
                                          new Subjects(3,"Physics"),
                                          new Subjects(4,"CS")
        );
        List<CumulativeMarks> cumulativeMarks = List.of(new CumulativeMarks(1,1,1,70),
                new CumulativeMarks(1,2,1,80),
                new CumulativeMarks(1,3,1,75),
                new CumulativeMarks(1,4,1,65),
                new CumulativeMarks(2,1,2,70),
                new CumulativeMarks(2,2,2,71),
                new CumulativeMarks(2,3,2,80),
                new CumulativeMarks(2,4,2,50)
        );
        System.out.println("Before calculating result :" + cumulativeMarks);
        System.out.println("After computation " + gradingMethods.calculateResult(cumulativeMarks));
        System.out.println("Before calculating result :" + cumulativeMarks);
        var studentMarkList = gradingMethods.displayMarks("Rem",students,cumulativeMarks);
        System.out.println("Subject ID " + "Mark");
        studentMarkList.forEach(s-> {
            var subjectName = subjects.stream().filter(m -> m.getId()==s.getSubjectID()).findFirst();
            System.out.println(subjectName.get().getSubjectName()+" "+s.getSubjectID() +"  "+ s.getSubjectMarks());
        });
        System.out.println("Total of marks");
        studentMarkList.forEach(s-> {
            var subjectName = subjects.stream().filter(m -> m.getId()==s.getSubjectID()).findFirst();
            System.out.println(subjectName.get().getSubjectName()+" "+s.getSubjectID() +"  "+ s.getSubjectMarks());
        });
        System.out.println(gradingMethods.calculateTotalMarks("Sam",students,cumulativeMarks));

    }
    // Function to finding out the result for all students
    // For given student listing all the marks
    // Finding out total marks per year for given student

    public List<CumulativeMarks> calculateResult(List<CumulativeMarks> cumulativeMarks){
        return cumulativeMarks.stream().map(p -> {
            if (p.getSubjectMarks() > 50) {
                p.setResult("PASS");
            } else {
                p.setResult("FAIL");
            }
            return p;
        }).collect(Collectors.toList());
    }

    public List<CumulativeMarks> displayMarks(String requiredStudentName, List<Student> students, List<CumulativeMarks> cumulativeMarks){
        Optional<Student> student1 = null;// students.stream().filter(s -> s.getName().equals(requiredStudentName)).findFirst();
        System.out.println(student1.get().getId()+" : "+student1.get().getName());
        return cumulativeMarks.stream().filter(c->c.getStudentID()==(student1.get().getId())).collect(Collectors.toList());
    }

    public Optional<IntSummaryStatistics> calculateTotalMarks(String givenName, List<Student> students, List<CumulativeMarks> cumulativeMarks){
        var student1 = students.stream().filter(s -> s.getName().equals(givenName)).findFirst();
        return Optional.ofNullable(cumulativeMarks.stream().filter(m->m.getStudentID()==(student1.get().getId())).collect(Collectors.summarizingInt(CumulativeMarks::getSubjectMarks)));
    }
}
