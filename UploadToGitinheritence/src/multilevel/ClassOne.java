package multilevel;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne co = new ClassOne();
		co.car();
		co.bike();
		
	}
	public void car() {
		System.out.println("Car code executed in child ");
	}
	public void bike() {
		System.out.println("Bike code executed in child ");
	}
}
