package DB;

import java.sql.SQLException;
import java.sql.Statement;

public class Migration implements MigrationInterface{

    private final Statement statement;

    public Migration(MySqlConnector connector) throws SQLException {
        this.statement = connector.getConnection().createStatement();
    }

    public void up() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS cats (id SERIAL PRIMARY KEY, name VARCHAR(255), color VARCHAR(255), age INT)";
        this.statement.executeUpdate(query);
        query = "CREATE TABLE IF NOT EXISTS dogs (id SERIAL PRIMARY KEY, name VARCHAR(255), color VARCHAR(255), age INT)";
        this.statement.executeUpdate(query);
        query = "CREATE TABLE IF NOT EXISTS hamsters (id SERIAL PRIMARY KEY, name VARCHAR(255), color VARCHAR(255), age INT)";
        this.statement.executeUpdate(query);
        query = "CREATE TABLE IF NOT EXISTS horses (id SERIAL PRIMARY KEY, name VARCHAR(255), color VARCHAR(255), age INT)";
        this.statement.executeUpdate(query);
        query = "CREATE TABLE IF NOT EXISTS camels (id SERIAL PRIMARY KEY, name VARCHAR(255), color VARCHAR(255), age INT)";
        this.statement.executeUpdate(query);
        query = "CREATE TABLE IF NOT EXISTS donkeys (id SERIAL PRIMARY KEY, name VARCHAR(255), color VARCHAR(255), age INT)";
        this.statement.executeUpdate(query);
    }

    public void down() throws SQLException {
        String query = "DROP TABLE IF EXISTS cats";
        this.statement.executeUpdate(query);
        query = "DROP TABLE IF EXISTS dogs";
        this.statement.executeUpdate(query);
        query = "DROP TABLE IF EXISTS hamsters";
        this.statement.executeUpdate(query);
        query = "DROP TABLE IF EXISTS horses";
        this.statement.executeUpdate(query);
        query = "DROP TABLE IF EXISTS camels";
        this.statement.executeUpdate(query);
        query = "DROP TABLE IF EXISTS donkeys";
        this.statement.executeUpdate(query);
    }

}
