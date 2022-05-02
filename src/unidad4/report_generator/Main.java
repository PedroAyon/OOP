package unidad4.report_generator;

import unidad4.report_generator.data.repository.ReportRepositoryImpl;
import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.ReporterFactory;
import unidad4.report_generator.domain.repository.ReportRepository;
import unidad4.report_generator.utils.Utils;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static ReportRepository repository;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opt = input("Select a data source (txt, email, db)");
        try {
            repository = new ReportRepositoryImpl(ReporterFactory.create(opt));
            repository.generateReport(readReport());
            System.out.println("Report stored.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Report readReport() throws ParseException {
        return new Report(
                input("Title"),
                Utils.DateFormatter.dateFromString(input("Date mm-dd-yyyy")),
                input("Author"),
                input("Content")
        );
    }

    private static String input(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    private static Integer inputInt(String message) {
        System.out.print(message + ": ");
        return Integer.valueOf(scanner.nextLine());
    }
}
