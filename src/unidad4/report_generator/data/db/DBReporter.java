package unidad4.report_generator.data.db;

import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.Reporter;
import unidad4.report_generator.utils.Utils;

import java.sql.SQLException;

public record DBReporter(SQLConnection db) implements Reporter {

    @Override
    public void generateReport(Report report) throws SQLException {
        db.runStatement(generateSQLQuery(report));
    }

    private String generateSQLQuery(Report report) {
        return String.format(
                "INSERT INTO report (title, date, author, content)\n" +
                        "VALUES ('%s', %s, '%s', '%s');",
                report.title(),
                Utils.SQL.sqlStrToDate(report.date()),
                report.author(),
                report.content()
        );
    }
}
