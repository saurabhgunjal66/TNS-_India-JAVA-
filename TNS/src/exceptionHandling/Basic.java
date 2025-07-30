package exceptionHandling;

public class Basic {
	public static void main(String[] args) {
		System.out.println("program.......");
		try {
			int a=100/0;
			System.out.println("output:"+a);
		}catch(ArithmeticException a) {
			System.err.println(a.getMessage());
		}
		System.out.println("end");
	}
}
