package JDBC.SpringExercise4_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"JDBC.SpringExercise4_1","Service"})
public class Config {
    @Bean
    public Exercise4 Exc() {
    	return new Exercise4();
    }
}
