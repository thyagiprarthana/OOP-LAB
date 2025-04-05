abstract class Ticket {
    private String passengerName;
    private double price;

    public Ticket(String name, double price) {
        this.passengerName = name;
        this.price = price;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getPrice() {
        return price;
    }

      public abstract void printTicket();
}

class TrainTicket extends Ticket {
    public TrainTicket(String name, double price) {
        super(name, price);
    }

    public void printTicket() {
        System.out.println("Train Ticket for " + getPassengerName() + " | Price: $" + getPrice());
    }
}

public class TicketApp {
    public static void main(String[] args) {
        Ticket myTicket = new TrainTicket("John Doe", 45.50);
        myTicket.printTicket(); // Output: Train Ticket for John Doe | Price: $45.5
    }
}
