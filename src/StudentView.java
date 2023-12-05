import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
//            logger.info(user.toString());
            System.out.println(user);
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
//        logger.info(studentGroup.toString());
        System.out.println(studentGroup);
    }

}
