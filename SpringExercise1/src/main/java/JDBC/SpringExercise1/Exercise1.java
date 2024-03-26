package JDBC.SpringExercise1;

import java.util.*;

public class Exercise1 {

	private HashMap<Integer, String> map;
	
	private Integer key;
	private String Value;

	public Exercise1() {
		super();
		map = new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public Exercise1(Integer key, String value) {
		super();
		this.key = key;
		Value = value;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(HashMap<Integer, String> map) {

		this.map = map;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	@Override
	public String toString() {
		
		return "Exercise1 [map=" + this.map + ", key=" + key + ", Value=" + Value + "]";
	}
	
	

	
	
}
