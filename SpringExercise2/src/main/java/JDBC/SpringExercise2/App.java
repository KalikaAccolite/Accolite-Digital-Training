package JDBC.SpringExercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
        
        Exercise2 info1 = (Exercise2) context.getBean("Info1");
        System.out.println(info1);
        
        Exercise2 info2 = (Exercise2) context.getBean("Info2");
        System.out.println(info2);
        
        Exercise2 info3 = (Exercise2) context.getBean("Info3");
        System.out.println(info3);
        
        Exercise2 info4 = (Exercise2) context.getBean("Info4");
        System.out.println(info4);
        
        Exercise2 info5 = (Exercise2) context.getBean("Info5");
        System.out.println(info5);


    }
}
