import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Integer teacherId;

    public Teacher(Integer teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator <T extends User> implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            if (resultOfComparing == 0) {
                resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
                if (resultOfComparing == 0) {
                    return o1.getPatronymic().compareTo(o2.getPatronymic());
                } else {
                    return resultOfComparing;
                }
            } else {
                return resultOfComparing;
            }
        }
    }
}
