package Command;

import DB.MySqlConnector;
import java.sql.*;

public class CommandHandler implements CommandHandlerInterface {
    private final Connection connection;

    public CommandHandler(MySqlConnector connector) {
        this.connection = connector.getConnection();
    }

    @Override
    public void create(String tableName, String name, String color, int age) throws SQLException {
        String query = "INSERT INTO " + tableName + " (name, color, age) VALUES (?, ?, ?)";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, name);
        statement.setString(2, color);
        statement.setInt(3, age);
        statement.executeUpdate();
    }
}
