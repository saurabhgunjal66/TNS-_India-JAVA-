package Oopconcept;

public class OopDemo {
	private int Num;
	private String name;
	private int age;
	public void setserialnum(int i,String name,int age) {
		this.Num=i;
		this.name=name;
		this.age=age;
		//System.out.println(this.Num);
		
	}
	
	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "OopDemo [Num=" + Num + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
}
