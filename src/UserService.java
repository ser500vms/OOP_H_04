import java.time.LocalDate;
import java.util.List;

public interface UserService<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
