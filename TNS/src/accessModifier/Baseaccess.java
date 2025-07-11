package accessModifier;
import accessModifier.Demo;
public class Baseaccess extends Demo {
	public static void main(String[] args) {
		System.out.println("hello");
		Demo d=new Demo();
		d.methodpublic();
		d.methoddefault();
		d.mrethodprotected();
		//d.methodPrivate();   private access modifier 
		
		
	}

}
