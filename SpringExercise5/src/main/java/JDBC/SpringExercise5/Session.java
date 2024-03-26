package JDBC.SpringExercise5;

public class Session {
	 	private int Session_id;
	    private String Session_name;
	    
		public Session() {
			super();
			// TODO Auto-generated constructor stub
		}

	

		public Session(int session_id, String session_name) {
			super();
			Session_id = session_id;
			Session_name = session_name;
		}



		public int getSession_id() {
			return Session_id;
		}

//		public void setSession_id(int session_id) {
//			Session_id = session_id;
//		}

		public String getSession_name() {
			return Session_name;
		}

//		public void setSession_name(String session_name) {
//			Session_name = session_name;
//		}

		@Override
		public String toString() {
			return "Session [Session_id=" + Session_id + ", Session_name=" + Session_name + "]";
		}
	    
	    


}
