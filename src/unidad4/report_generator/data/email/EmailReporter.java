package unidad4.report_generator.data.email;

import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.Reporter;

public class EmailReporter implements Reporter {
    @Override
    public void generateReport(Report report) {
        System.out.println("Email sent.");
    }
}
