package unidad1.tickets;

/**
 * @author Pedro Ayon
 */
public class Utils {
    public static String moneyFormat(double amount) {
        return String.format("$%.2f", amount);
    }
    public static Double positiveNumber(Double n) {
        if (n > 0) return n;
        return 0.0;
    }

    public static Integer positiveNumber(Integer n) {
        if (n > 0) return n;
        return 0;
    }
}
