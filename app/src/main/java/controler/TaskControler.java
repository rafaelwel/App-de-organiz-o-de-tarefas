package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javafx.concurrent.Task;
import util.ConnectionFactory;

public class TaskControler {

    public void save(Task task) {

    }

    public void update(Task task) {

    }

    public void removeById(int taskId) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
                Connection conn = null;
                PreparedStatement statement = null;
                
                try {
                    conn = ConnectionFactory.getConnection();
                    statement = conn.prepareStatement(sql);
                    statement.setInt(1, taskId);
                    statement.execute();
                
                } catch (SQLException e) {
                    throw new SQLException("Erro ao deletar tarefa");
                    
                } finally {
                    ConnectionFactory.closeConnection(conn);
                
                }
        

    }

    
    public List <Task> getAll(int idProject) {

      
        return null;

        

    }
}
