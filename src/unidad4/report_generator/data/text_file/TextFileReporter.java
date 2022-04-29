package unidad4.report_generator.data.text_file;

import unidad4.report_generator.domain.model.Report;
import unidad4.report_generator.domain.model.Reporter;
import unidad4.report_generator.utils.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFileReporter implements Reporter {
    private String dateFormatted;

    @Override
    public void generateReport(Report report) {
        dateFormatted = Utils.DateFormatter.dateToString(report.date());
        String filePath = generateFilePath(report);
        try {
            Files.createFile(Paths.get(filePath));
            writeReport(report, filePath);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Report already exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String generateFilePath(Report report) {
        String reportDirectoryPath = "/home/pedroayonb/Documents/Reports/";
        return reportDirectoryPath + dateFormatted + "-" + report.title() + ".txt";
    }

    private void writeReport(Report report, String filePath) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(filePath);
        printWriter.println(report.title());
        printWriter.println("Author: " + report.author());
        printWriter.println("Date: " + dateFormatted);
        printWriter.println(report.content());
        printWriter.close();
    }
}
