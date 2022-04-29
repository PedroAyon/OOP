package unidad4.report_generator.data.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnection implements SQLConnection {
    private Connection connection;
    public MariaDBConnection() {
        connect();
    }
    @Override
    public void connect() {
        if (connection != null) return;
        final String URL = "jdbc:mariadb://localhost:3306/reports";
        final String USER = "java";
        final String PASS = "java123";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected database successfully...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void runStatement(String sql) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
