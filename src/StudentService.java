import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        int countMaxId = 0;
        for (Student student: students){
                if (student.getStudentId() > countMaxId){
                    countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(countMaxId, firstName, secondName, patronymic, dateOfBirth);
        students.add(student);
    }
}
