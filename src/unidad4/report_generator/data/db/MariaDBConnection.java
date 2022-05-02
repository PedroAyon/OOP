package unidad4.report_generator.data.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnection implements SQLConnection {
    private Connection connection;

    public MariaDBConnection() throws SQLException, ClassNotFoundException {
        connect();
    }

    @Override
    public void connect() throws ClassNotFoundException, SQLException {
        if (connection != null) return;
        final String URL = "jdbc:mariadb://localhost:3306/reports";
        final String USER = "java";
        final String PASS = "java123";
        Class.forName("org.mariadb.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("Connected database successfully...");
    }

    @Override
    public void runStatement(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(sql);
    }
}
