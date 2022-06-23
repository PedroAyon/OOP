package unidad4.report_generator.data.repository;

import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.Reporter;

import java.util.ArrayList;
import java.util.List;

public class ReportRepositoryImpl implements unidad4.report_generator.domain.repository.ReportRepository {
    Reporter reporter;

    public ReportRepositoryImpl(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public void generateReport(Report report) throws Exception {
        reporter.generateReport(report);
    }

    @Override
    public List<Report> getAllReports() {
        List<Report> reports = new ArrayList<>();
        return reports;
    }
}
