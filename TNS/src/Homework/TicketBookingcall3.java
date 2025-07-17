package Homework;
import java.util.Scanner;
public class TicketBookingcall3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.trim().isEmpty()) break; // optional: allow empty line to end

            // Read ticket booking info
            String[] parts = line.split(",");
            String stageEvent = parts[0];
            String customer = parts[1];
            int noOfSeats = Integer.parseInt(parts[2]);

            TicketBooking3 booking = new TicketBooking3(stageEvent, customer, noOfSeats);

            // Read payment type
            int choice = Integer.parseInt(sc.nextLine());

            // Output ticket booking details
            System.out.println("Stage event:" + booking.getStageEvent());
            System.out.println("Customer:" + booking.getCustomer());
            System.out.println("Number of seats:" + booking.getNoOfSeats());

            switch (choice) {
                case 1:
                    double amount1 = Double.parseDouble(sc.nextLine());
                    booking.makePayment(amount1);
                    break;

                case 2:
                    double amount2 = Double.parseDouble(sc.nextLine());
                    String walletNumber = sc.nextLine();
                    booking.makePayment(walletNumber, amount2);
                    break;

                case 3:
                    String holderName = sc.nextLine();
                    double amount3 = Double.parseDouble(sc.nextLine());
                    String creditCard = sc.nextLine();
                    String ccv = sc.nextLine();
                    booking.makePayment(creditCard, ccv, holderName, amount3);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
	

}
