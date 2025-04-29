import java.util.*;

class FlightTicket implements Comparable<FlightTicket> {
    String passenger;
    int priority;

    FlightTicket(String passenger, int priority) {
        this.passenger = passenger;
        this.priority = priority;
    }

    public int compareTo(FlightTicket ft) {
        return Integer.compare(this.priority, ft.priority);
    }
}

class FlightBookingSystem {
    public static void main(String[] args) {
        Queue<FlightTicket> tickets = new PriorityQueue<>();
        tickets.add(new FlightTicket("Damu", 3));
        tickets.add(new FlightTicket("Bharath", 2));
        tickets.add(new FlightTicket("Ajay", 1));
        System.out.println("Tickets: " + tickets);
    }
}