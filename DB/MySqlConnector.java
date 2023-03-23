package DB;

import java.sql.*;

public class MySqlConnector implements ConnectorInterface {

    private final String url = "jdbc:mysql://localhost:3306/shelter";
    private final String user = "root";
    private final String password = "1111";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
