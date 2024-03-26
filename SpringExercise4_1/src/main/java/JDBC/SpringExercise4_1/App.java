package JDBC.SpringExercise4_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

 public class App{
     public static void main( String[] args )
     {
         System.out.println("Exercise 4");
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
         Exercise4 exc = context.getBean(Exercise4.class);
         exc.setName("Kalika Awasthi");
         exc.setAge(21);
         exc.setCity("Kanpur");
         exc.display();
         context.close();
     }
 }
