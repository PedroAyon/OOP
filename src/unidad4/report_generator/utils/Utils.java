package unidad4.report_generator.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static class DateFormatter{
        private static String pattern = "MM-dd-yyyy";
        public static String dateToString(Date date) {
            DateFormat dateFormat = new SimpleDateFormat(pattern);
            return dateFormat.format(date);
        }

        public static Date dateFromString(String str) throws ParseException {
            return new SimpleDateFormat(pattern).parse(str);
        }
    }
    public static class SQL {
        public static String sqlStrToDate(Date date) {
            return "STR_TO_DATE('" + DateFormatter.dateToString(date) + "', '%m-%d-%Y')";
        }
    }
}
