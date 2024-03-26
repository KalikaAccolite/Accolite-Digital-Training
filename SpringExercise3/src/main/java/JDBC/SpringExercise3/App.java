package JDBC.SpringExercise3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Exercise3 info1 = (Exercise3) context.getBean("Info1");
        System.out.println(info1);
        
        Exercise3 info2 = (Exercise3) context.getBean("Info2");
        System.out.println(info2);
        
        Exercise3 info3 = (Exercise3) context.getBean("Info3");
        System.out.println(info3);
        
        Exercise3 info4 = (Exercise3) context.getBean("Info4");
        System.out.println(info4);
        
        Exercise3 info5 = (Exercise3) context.getBean("Info5");
        System.out.println(info5);

    }
}
