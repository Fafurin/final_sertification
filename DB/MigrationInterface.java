package DB;

import java.sql.SQLException;

public interface MigrationInterface {
    void up() throws SQLException;
    void down() throws SQLException;
}
