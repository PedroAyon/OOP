package unidad4.report_generator;

import unidad4.report_generator.data.db.DBReporter;
import unidad4.report_generator.data.db.MariaDBConnection;
import unidad4.report_generator.data.email.EmailReporter;
import unidad4.report_generator.data.repository.ReportRepositoryImpl;
import unidad4.report_generator.data.text_file.TextFileReporter;
import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.repository.ReportRepository;
import unidad4.report_generator.utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    static ReportRepository repository;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(args.length == 0 ? "Missing arguments" : "Too much arguments");
            System.exit(1);
        }
        switch (args[0]) {
            case "txt" -> repository = new ReportRepositoryImpl(new TextFileReporter());
            case "db" -> repository = new ReportRepositoryImpl(new DBReporter(new MariaDBConnection()));
            case "email" -> repository = new ReportRepositoryImpl(new EmailReporter());
            default -> {
                System.out.println("Wrong arguments");
                System.exit(1);
            }
        }

        try {
            Report report = readReport();
            repository.generateReport(report);
        } catch (ParseException e) {
            System.out.println("Wrong date format");
            System.exit(1);
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
}
