package JDBC.SpringExercise2;

public class Exercise2 {

	private String Name;
	private Integer Age;
	private String City;
	
	public Exercise2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exercise2(String name, Integer age, String city) {
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

	@Override
	public String toString() {
		return "Name=" + Name + ", Age=" + Age + ", City=" + City ;
	}
	
	
	
}
