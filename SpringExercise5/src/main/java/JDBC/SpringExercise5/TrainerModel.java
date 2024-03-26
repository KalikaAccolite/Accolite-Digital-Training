package JDBC.SpringExercise5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainerModel {
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Kalika@1529");
    }

    public List<Trainer> getAllTrainersWithSessions() {
        List<Trainer> trainersList = new ArrayList<>();
        Map<Integer, Trainer> trainerMap = new HashMap<>();

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            String query = "SELECT t.t_id, t.t_name , " +
                    "s.s_id, s.s_name  " +
                    "FROM trainer t LEFT JOIN session s ON t.t_id = s.s_id";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int trainer_Id = rs.getInt("t_id");
                String trainerName = rs.getString("t_name");
                int session_Id = rs.getInt("s_id");
                String sessionName = rs.getString("s_name");

                Trainer trainer;
                if (!trainerMap.containsKey(trainer_Id)) {
                    trainer = new Trainer(trainer_Id, trainerName);
                    trainersList.add(trainer);
                    trainerMap.put(trainer_Id, trainer);
                } else {
                    trainer = trainerMap.get(trainer_Id);
                }

                if (session_Id != 0) {
                    Session session = new Session(session_Id, sessionName);
                    trainer.getSessions().add(session);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trainersList;
    }
}
