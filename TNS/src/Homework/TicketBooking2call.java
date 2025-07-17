package Homework;

public class TicketBooking2call {
    public static void main(String[] args) {
        TicketBooking2 booking = new TicketBooking2("Stage Drama", "Alice", 2);

        booking.makePayment(500.0);  
        booking.makePayment("WALLET1234", 600.0);  
        booking.makePayment("1234-5678-9101-1121", "456", "Alice", 750.0);  
    }
}
