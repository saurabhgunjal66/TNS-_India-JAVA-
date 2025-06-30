package loopingcondition;

public class BloodDonation {
	public static void main(String[] args) {
		int age=17;
		int weight=52;
		if(age>=18 && age<=50 && weight>=50) {
			System.out.println("eligible for blood donations");
		}
		else {
			System.out.println("not eligible for blood donations");
		}
	}
	
}
