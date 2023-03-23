package Command;

import java.sql.SQLException;

public interface CommandHandlerInterface {

    void create(String tableName, String name, String color, int age) throws SQLException;

}
