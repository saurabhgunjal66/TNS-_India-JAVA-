package inheritance;

public class Person1 {
	private	String name;
	private long contact;
	public Person1(String name, long contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + "]";
	}
	
	
}
