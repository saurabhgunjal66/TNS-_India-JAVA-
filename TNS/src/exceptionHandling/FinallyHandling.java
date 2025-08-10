package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyHandling {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            System.out.println("Hello");
            sc = new Scanner(System.in);
            System.out.println("Enter number:");
            int num = sc.nextInt(); // may throw InputMismatchException
            System.out.println("Addition: " + (num + num));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            if (sc != null) {
                sc.close(); // release the Scanner resource
                System.out.println("Scanner closed.");
            }
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
