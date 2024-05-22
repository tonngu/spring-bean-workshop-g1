package se.lexicon.g1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.g1.config.ComponentScanConfig;
import se.lexicon.g1.data_access.StudentDao;
import se.lexicon.g1.service.StudentManagement;
import se.lexicon.g1.service.StudentManagementConsoleImpl;
import se.lexicon.g1.service.UserInputService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService = context.getBean(UserInputService.class);

        StudentManagement studentManagement = context.getBean(StudentManagementConsoleImpl.class);
        studentManagement.create();
        System.out.println();

    }

}
