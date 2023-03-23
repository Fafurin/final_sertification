package DB;

import java.sql.Connection;

public interface ConnectorInterface {
    Connection getConnection();
}
