package unidad4.report_generator.data.db;

import java.sql.SQLException;

public interface SQLConnection {
    void connect() throws Exception;
    void runStatement(String sql) throws SQLException;
}
