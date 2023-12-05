import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        int countMaxId = 0;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(countMaxId, firstName, secondName, patronymic, dateOfBirth);
        teachers.add(teacher);
    }
}
