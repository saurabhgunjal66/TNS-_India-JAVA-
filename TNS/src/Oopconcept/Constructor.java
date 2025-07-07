package Oopconcept;

public class Constructor {
	int a;
	int b;
	// getter setter
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	//default constructor
	public Constructor() {
		System.out.println("default constructor");
	}
	
	//parametraze constructor
	public Constructor(int a,int b) {

		int c=a+b;
		System.out.println("addition:"+c);
	}

	
	
	
}
