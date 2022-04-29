package unidad4.report_generator.data.repository;

import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.Reporter;

public class ReportRepositoryImpl implements unidad4.report_generator.domain.repository.ReportRepository {
    Reporter reporter;

    public ReportRepositoryImpl(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public void generateReport(Report report) {
        reporter.generateReport(report);
    }
}
