package staticAndFinal;

public class FinalVariable {
	
	final int  a=100;
	final static int b=20;
	void display() {
		//a=20;// can not re-assign as per final
		System.out.println(a);
		
	}
	
	

	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();
		
		f.display();
	}
}
