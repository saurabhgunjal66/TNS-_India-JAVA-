package inheritance;

public class Employee extends Person1 {
	
	private String dept;
	private long salary;
	public Employee(String dept, long salary) {
		//super();
		this.dept = dept;
		this.salary = salary;
	}
	
}
