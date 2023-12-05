import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        StudentController controller = new StudentController();
//
//        controller.create("Masha", "Gyzeeva","Petrovna",
//                LocalDate.of(1986,12,12));
//        controller.create("Petya", "Gyzeev","Petrov",
//                LocalDate.of(1986,12,12));
//        controller.create("Galya", "Ivanova","Ivanovna",
//                LocalDate.of(1986,12,12));
//        controller.create("Igor", "Onefriev","Pavlovich",
//                LocalDate.of(1986,12,12));
//
//        controller.sendOnConsole();

        TeacherController controller = new TeacherController();

        controller.create("Masha", "Gyzeeva","Petrovna",
                LocalDate.of(1986,12,12));
        controller.create("Petya", "Gyzeev","Petrov",
                LocalDate.of(1986,12,12));
        controller.create("Galya", "Ivanova","Ivanovna",
                LocalDate.of(1986,12,12));
        controller.create("Igor", "Onefriev","Pavlovich",
                LocalDate.of(1986,12,12));

        controller.sendOnConsole();
    }
}