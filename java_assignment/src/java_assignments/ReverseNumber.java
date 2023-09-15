package java_assignments;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dob = 13062022, reverse = 0;  
		while(dob != 0)   
		{  
		int remainder = dob % 10;  
		reverse = reverse * 10 + remainder;  
		dob = dob/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}

}
