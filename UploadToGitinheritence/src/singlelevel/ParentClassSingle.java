package singlelevel;

public class ParentClassSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClassSingle pcs = new ParentClassSingle();
		pcs.engine();
		pcs.breaks();
		}
	public void engine() {
		System.out.println("Engine code Executed");
	}
	public void breaks() {
		System.out.println("Breaks code Executed");
	}
	}

