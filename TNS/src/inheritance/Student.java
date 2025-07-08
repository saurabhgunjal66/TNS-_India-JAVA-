package inheritance;

public class Student extends Citizen {
	
	private int rollNo;
	private String collage;
	public Student()
	{
		System.out.println("constructor students");
	}
	
	
	public Student(int id,String name, int rollNo, String collage,String add,long adhar) {
		
		super(id,name,adhar, add);
		
		this.rollNo = rollNo;
		this.collage = collage;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collage=" + collage + ", Id=" + getId() + ", Name="
				+ getName() + ", Add=" + getAdd() + "]";
	}
	
	
	
}
