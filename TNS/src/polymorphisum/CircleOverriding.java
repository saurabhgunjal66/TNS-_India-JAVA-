package polymorphisum;

public class CircleOverriding extends ShapeOverriding {
	//child
	double radius;
	  public CircleOverriding(double radius) {
		super(radius);
		this.radius=radius;
	}
	
	public void show() {
		System.out.println("radius"+ this.radius);
	}
}
