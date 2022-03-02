package unidad1y2.tickets;

import java.io.IOException;

/**
 * @author Pedro Ayon
 */
public class TicketMachine {
    private final MoneyScanner moneyScanner;
    private final double fee;
    private double raisedMoney;
    private int inactivitySeconds = 5;

    public TicketMachine(double fee) {
        this.fee = fee;
        moneyScanner = new MoneyScanner(inactivitySeconds);
    }

    public TicketMachine(double fee, int inactivitySeconds) {
        this.fee = fee;
        this.inactivitySeconds = inactivitySeconds;
        moneyScanner = new MoneyScanner(inactivitySeconds);
    }

    public void insertMoney() {
        try {
            moneyScanner.activateMoneyScanner();
        } catch (IOException e) {
            log("An error has occurred, please try again");
        }
    }

    public void buyTickets(int numberOfTickets) {
        numberOfTickets = Utils.positiveNumber(numberOfTickets);
        double total = numberOfTickets * fee;
        log("Requested to buy " + numberOfTickets + " tickets, wtih a total of " + Utils.moneyFormat(total));
        if (canBuyTickets(numberOfTickets)) {
            giveRemainingMoney(moneyScanner.amount - total);
            printTickets(numberOfTickets);
            this.raisedMoney += total;
        } else giveRemainingMoney(moneyScanner.amount);
        moneyScanner.clearAmount();
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
        for (int i = 0; i < numberOfTickets; i++) {
            printTicket();
        }
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
