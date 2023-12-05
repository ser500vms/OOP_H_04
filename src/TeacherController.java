import java.time.LocalDate;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherService.getTeachers());
    }
}
