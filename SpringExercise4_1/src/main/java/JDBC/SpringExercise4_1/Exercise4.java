package JDBC.SpringExercise4_1;

import java.util.Random;

public class Exercise4 {
	
		
		private String Name;
		private Integer Age;
		private String City;
		
		public Exercise4() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Exercise4(String name, Integer age, String city) {
			super();
			Name = name;
			Age = age;
			City = city;
		}
		
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public Integer getAge() {
			return Age;
		}
		public void setAge(Integer age) {
			Age = age;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public void display() {
			System.out.println("Name=" + Name + ", Age=" + Age + ", City=" + City );
			Random random = new Random();
	        int delay = random.nextInt(100);
	        try {
	        	System.out.println("Delay added : "+delay+ " ms");
	            Thread.sleep(delay);
	        }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}
}
