package singlelevel;

public class ChildClassSingle extends ParentClassSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassSingle css = new ChildClassSingle();
		css.tyres();
		css.rpm();
		css.engine();
		css.breaks();
		
	}
	public void tyres() {
		System.out.println("Tyres code Executed");
	}
	public void rpm() {
		System.out.println("RPM code Executed");
	}

}
