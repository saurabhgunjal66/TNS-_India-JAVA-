package Homework;


public class TicketBooking {

    //data type
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default Constructor
    public TicketBooking() {

    }

    

	// Parameterized Constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getter for stageEvent
    public String getStageEvent() {
        return stageEvent;
    }

    // Setter for stageEvent
    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    // Getter for customer
    public String getCustomer() {
        return customer;
    }

    // Setter for customer
    public void setCustomer(String customer) {
        this.customer = customer;
    }

	// Getter for noOfSeats
	public Integer getNoOfSeats() {
	    return noOfSeats;
	}
	
    // Setter for noOfSeats
    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    @Override
	public String toString() {
		return "TicketBooking [stageEvent=" + stageEvent + ", customer=" + customer + ", noOfSeats=" + noOfSeats + "]";
	}



	
}


