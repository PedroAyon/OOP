package unidad4.report_generator.domain.repository;

import unidad4.report_generator.domain.model.Report;

public interface ReportRepository {
    void generateReport(Report report) throws Exception;
}
