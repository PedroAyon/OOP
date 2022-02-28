package unidad1.tickets;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine(30);
        ticketMachine.insertMoney();
        ticketMachine.buyTickets(3);
        System.out.println();
        ticketMachine.insertMoney();
        ticketMachine.buyTickets(10);
        System.out.println();
        ticketMachine.insertMoney();
        ticketMachine.buyTickets(10);
        System.out.println();
        ticketMachine.printRaisedMoney();
    }
}
