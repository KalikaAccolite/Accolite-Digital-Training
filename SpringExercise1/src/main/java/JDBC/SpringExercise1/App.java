package JDBC.SpringExercise1;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import JDBC.SpringExercise1.Exercise1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HashMap<Integer,String> hsh = new HashMap<>();
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
       
        Exercise1 Key1 = (Exercise1) context.getBean("key1");
        hsh.put(Key1.getKey(),Key1.getValue());
        System.out.println(hsh);
      //  System;
        
        Exercise1 Key2 = (Exercise1) context.getBean("key2");
        hsh.put(Key2.getKey(),Key2.getValue());
        System.out.println(hsh);
        
        Exercise1 Key3 = (Exercise1) context.getBean("key3");
        hsh.put(Key3.getKey(),Key3.getValue());
        System.out.println(hsh);
        
        Exercise1 Key4 = (Exercise1) context.getBean("key4");
        hsh.put(Key4.getKey(),Key4.getValue());
        System.out.println(hsh);
        
        Exercise1 Key5 = (Exercise1) context.getBean("key5");
        hsh.put(Key5.getKey(),Key5.getValue());
        System.out.println(hsh);
        
        
    }
}
