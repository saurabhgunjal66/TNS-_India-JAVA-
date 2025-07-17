package staticAndFinal;

public class Employee {
	int id;
	String name ;
	static String CompanyName="TNS";  //always constant and declare in global variable and not changble
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void empDate() {
		System.out.println("Id: "+id+" name: "+name +" Company: "+CompanyName);
	}
	
}
