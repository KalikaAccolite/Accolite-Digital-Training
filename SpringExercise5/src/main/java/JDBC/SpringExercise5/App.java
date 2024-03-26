package JDBC.SpringExercise5;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Trainers with Sessions:");
         TrainerModel trainerModel = new TrainerModel();
         for (Trainer trainer : trainerModel.getAllTrainersWithSessions()) {
             System.out.println("Trainer: " + trainer.getName());
             System.out.println("Sessions:");
             for (Session session : trainer.getSessions()) {
                 System.out.println("- " + session.getSession_name());
             }
             System.out.println();
         }
    }
}
