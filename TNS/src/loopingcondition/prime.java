package loopingcondition;

public class prime {
	public static void main(String[] args) {
		 
	       

	     
	        System.out.print("Enter a number: ");
	        int num = 5;
	        boolean isPrime = true;

	        
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        
	        if (isPrime)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	        
	        
	    
	}
}
