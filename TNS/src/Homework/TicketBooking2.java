package Homework;

public class TicketBooking2 {
	//polymorphisum  operator overriding 
    
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default Constructor
    public TicketBooking2() {
      
    }

    // Parameterized Constructor
    public TicketBooking2(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Method Overloading

    // 1. Cash Payment
    public void makePayment(Double amount) {
        System.out.println("Cash payment of Rs. " + amount + " received.");
        System.out.println("Transaction successful for customer: " + customer);
    }

    // 2. Wallet Payment
    public void makePayment(String walletNumber, Double amount) {
    	System.out.println("===============================================");
        System.out.println("Wallet payment of Rs. " + amount + " from wallet number: " + walletNumber);
        System.out.println("Transaction successful for customer: " + customer);
    }

    // 3. Credit Card Payment
    public void makePayment(String creditCard, String ccv, String name, Double amount) {
    	System.out.println("==============================================");
        System.out.println("Credit Card Payment Details:");
        System.out.println("Card Number: " + creditCard);
        System.out.println("CCV: " + ccv);
        System.out.println("Card Holder: " + name);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Transaction successful for customer: " + customer);
    }
}

