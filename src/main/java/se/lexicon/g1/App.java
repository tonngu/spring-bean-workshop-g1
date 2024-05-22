package se.lexicon.g1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.g1.config.ComponentScanConfig;
import se.lexicon.g1.data_access.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

    }

}
