package conditionalStatement;

public class nestedifcondition {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is greater");
			}
			else {
				System.out.println(c+" is greater");
			}
		}
		else {
			if(b>c) {
			 System.out.println(b+" is greater");
			}
			else {
				System.out.println(c+" is greater");
			}
		}
		
	}

}
