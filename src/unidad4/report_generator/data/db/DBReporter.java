package unidad4.report_generator.data.db;

import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.Reporter;
import unidad4.report_generator.utils.Utils;

public class DBReporter implements Reporter {
    private SQLConnection db;

    public DBReporter(SQLConnection db) {
        this.db = db;
    }

    @Override
    public void generateReport(Report report) {
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
