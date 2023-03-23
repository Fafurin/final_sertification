package DB;

import java.sql.*;

public class MySqlConnector implements ConnectorInterface {

    private final String url = "jdbc:mysql://localhost:3306/shelter";
    private String user;
    private String password;

    public MySqlConnector(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
