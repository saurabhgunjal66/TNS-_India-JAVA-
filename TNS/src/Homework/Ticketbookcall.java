package Homework;

public class Ticketbookcall {
 
	    public static void main(String[] args) {
	        
	        TicketBooking booking1 = new TicketBooking();
	        booking1.setStageEvent("Drama Night");
	        booking1.setCustomer("Alice");
	        booking1.setNoOfSeats(3);
	        System.out.println(booking1);

	        
	        TicketBooking booking2 = new TicketBooking("Music Concert", "Bob", 2);
	        System.out.println(booking2);

	       
	    }
	}


