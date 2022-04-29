package unidad4.report_generator.domain.model;

import java.util.Date;

public record Report(String title, Date date, String author, String content) {
}
