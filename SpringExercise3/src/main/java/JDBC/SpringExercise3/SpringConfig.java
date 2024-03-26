package JDBC.SpringExercise3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean(name="Info1")
	public Exercise3 info1() {
		return new Exercise3("Kalika", 20,"Kanpur");
	}
	
	@Bean(name="Info2")
	public Exercise3 info2() {
		return new Exercise3("Utkarsh", 22,"Kanpur");
	}
	
	@Bean(name="Info3")
	public Exercise3 info3() {
		return new Exercise3("Shivi", 23,"Lucknow");
	}
	
	@Bean(name="Info4")
	public Exercise3 info4() {
		return new Exercise3("Aman", 26,"Unnao");
	}
	
	@Bean(name="Info5")
	public Exercise3 info5() {
		return new Exercise3("Avikaar", 30,"Banaras");
	}
}
