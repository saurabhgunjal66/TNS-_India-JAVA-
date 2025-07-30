package exceptionHandling;

import java.util.Scanner;

public class MultipleBloack {
	public static void main(String[] args) {
		System.out.println("hello ram");
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		try {
			while(true) {
				System.out.println("first Number:");
				num1=sc.nextInt();
				
				System.out.println("secound Number:");
				num2=sc.nextInt();
				
				num3=num1/num2;
				System.out.println("division"+num3);
			}	
				
		}catch(ArithmeticException e) {
			System.out.println("error"+e.getMessage());
		}
		System.out.println("end");
		
	}
}
