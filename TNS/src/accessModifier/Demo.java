package accessModifier;

public class Demo {
	int varDefault=10;
	private int varPrivate=20;
	protected int varProtected =30;
	public int varpublic=40;
	
	private void methodPrivate() {
		System.out.println("private");
	}
	protected void mrethodprotected() {
		System.out.println("protected");
	}
	public void methodpublic() {
		System.out.println("public");
	}
	void methoddefault() {
		System.out.println("default");
	}
}
