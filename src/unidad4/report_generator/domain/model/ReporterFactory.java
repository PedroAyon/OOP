package unidad4.report_generator.domain.model;

import unidad4.report_generator.data.db.DBReporter;
import unidad4.report_generator.data.db.MariaDBConnection;
import unidad4.report_generator.data.email.EmailReporter;
import unidad4.report_generator.data.text_file.TextFileReporter;

import java.sql.SQLException;

public class ReporterFactory {
    public static Reporter create(String opt) throws SQLException, ClassNotFoundException {
        return switch (opt) {
            case "txt" -> new TextFileReporter();
            case "email" -> new EmailReporter();
            case "db" -> new DBReporter(new MariaDBConnection());
            default -> null;
        };
    }
}
