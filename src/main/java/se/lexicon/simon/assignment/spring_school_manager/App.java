package se.lexicon.simon.assignment.spring_school_manager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.simon.assignment.spring_school_manager.config.ComponentScanConfig;
import se.lexicon.simon.assignment.spring_school_manager.data_access.StudentDao;
import se.lexicon.simon.assignment.spring_school_manager.service.ScannerInputService;
import se.lexicon.simon.assignment.spring_school_manager.service.UserInputService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    	
//    	StudentDao studentDao = context.getBean(StudentDao.class);
    	    	
    	UserInputService userInputService = context.getBean(UserInputService.class);

    	System.out.println(userInputService.getString());
    	
    	context.close();
    	
    	
    }
}
