package unidad1.tickets;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * @author Pedro Ayon
 */
public class TicketMachine {
    private final MoneyScanner moneyScanner;
    private final double fee;
    private double raisedMoney;
    private int maxSecondsOfInactivity = 5;

    public TicketMachine(double fee) {
        this.fee = fee;
        moneyScanner = new MoneyScanner(maxSecondsOfInactivity);
    }

    public TicketMachine(double fee, int maxSecondsOfInactivity) {
        this.fee = fee;
        this.maxSecondsOfInactivity = maxSecondsOfInactivity;
        moneyScanner = new MoneyScanner(maxSecondsOfInactivity);
    }

    public void insertMoney() {
        try {
            moneyScanner.activateMoneyScanner();
        } catch (IOException e) {
            log("An error has occurred, please try again");
        }
    }

    public void buyTickets(int numberOfTickets) {
        log("Requested to buy " + numberOfTickets + " tickets");
        numberOfTickets = Utils.positiveNumber(numberOfTickets);
        if (canBuyTickets(numberOfTickets)) {
            double total = numberOfTickets * fee;
            giveRemainingMoney(moneyScanner.amount - total);
            this.raisedMoney += total;
            moneyScanner.clearAmount();
            printTickets(numberOfTickets);
        }
    }

    private boolean canBuyTickets(int numberOfTickets) {
        if (numberOfTickets == 0) {
            log("Select at least 1 ticket to buy");
            return false;
        } else if (moneyScanner.amount < numberOfTickets*fee) {
            log("Not enough money for the purchase");
            return false;
        }
        return true;
    }

    private void giveRemainingMoney(double amount) {
        if (amount == 0) return;
        log("Your remaining money: " + Utils.moneyFormat(amount));
    }

    private void printTickets(int numberOfTickets) {
        IntStream.range(0, numberOfTickets).forEachOrdered(i -> printTicket());
    }

    private void printTicket() {
        log("Train Ticket");
    }

    public void printRaisedMoney() {
        log("Raised money: " + Utils.moneyFormat(this.raisedMoney));
    }

    private void log(String message) {
        System.out.println("Ticket Machine> " + message);
    }
}
