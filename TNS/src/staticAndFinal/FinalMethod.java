package staticAndFinal;

public class FinalMethod {
	final int  a=10;
	
	final void display() {
		//a=20;// can not re-assign as per final
		System.out.println(a);
		System.out.println("hello Kunal");
		
	}
	
	

	public static void main(String[] args) {
		FinalMethod a=new FinalMethod();
		
		a.display();
	}
}
///in case of class final 
///we can not inherited final class
