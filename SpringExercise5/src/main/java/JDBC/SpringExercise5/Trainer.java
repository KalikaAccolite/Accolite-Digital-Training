package JDBC.SpringExercise5;

import java.util.*;
public class Trainer {
	
	  	private int id;
	    private String name;
	    private List<Session> Sessions;
	    
	    public Trainer(int id, String name) {
	        this.id = id;
	        this.name = name;
	        this.Sessions = new ArrayList<>();
	    }

		public int getId() {
			return id;
		}

//		public void setId(int id) {
//			this.id = id;
//		}

		public String getName() {
			return name;
		}

//		public void setName(String name) {
//			this.name = name;
//		}

		public List<Session> getSessions() {
			return Sessions;
		}

//		public void setSessions(List<Session> sessions) {
//			Sessions = sessions;
//		}

	    
	    
}
