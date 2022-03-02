package unidad1y2.tickets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pedro Ayon
 */
public class MoneyScanner {
    private final long inactivitySeconds;
    private final BufferedReader bufferedReader;
    double amount;

    public MoneyScanner(long inactivitySeconds) {
        this.inactivitySeconds = inactivitySeconds;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void activateMoneyScanner() throws IOException, NumberFormatException {
        System.out.println("Money scanner activated.");
        while (waitForInputUntilTimeout()) {
            amount += Utils.positiveNumber(Double.parseDouble(bufferedReader.readLine()));
            System.out.println("Acumulated: " + Utils.moneyFormat(amount));
        }
        System.out.println("Money scanner stopped.");
    }

    private boolean waitForInputUntilTimeout() throws IOException {
        long startTime = System.currentTimeMillis();
        while (true)
            if ((System.currentTimeMillis() - startTime) >= inactivitySeconds * 1000 || bufferedReader.ready()) break;
        return bufferedReader.ready();
    }

    public void clearAmount() {
        this.amount = 0;
    }
}
