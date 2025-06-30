package loopingcondition;

public class ContinueKey {
	public static void main(String[] args) {
		int n=10;
		if(n%2==0) {
			System.out.println("even");
			
		}
		else {
			System.out.println(n+" is odd");
		}
		
		System.out.println("-----------------------------------");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("values of i: "+i);
			
		}
	}
	
}
