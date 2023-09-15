package multilevel;

public class ClassThree extends ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassThree cth = new ClassThree();
		cth.flight();
		cth.train();
		cth.cycle();
		cth.scooty();
		cth.car();
		cth.bike();
	}
	public void flight() {
		System.out.println("Flight code executed in child ");
	}
	public void train() {
		System.out.println("Train code executed in child ");
}
}
