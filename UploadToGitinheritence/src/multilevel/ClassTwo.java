package multilevel;

public class ClassTwo extends ClassOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTwo ct = new ClassTwo();
		ct.cycle();
		ct.scooty();
		ct.car();
		ct.bike();
		
	}
	public void cycle() {
		System.out.println("Cycle code executed in child ");
	}
	public void scooty() {
		System.out.println("Scooty code executed in child ");
	}
	}


