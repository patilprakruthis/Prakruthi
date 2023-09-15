package java_assignments;

public class Sum_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		  int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8,9};  
	        int sum = 0;  
	        for (int i = 0; i < arr.length; i++) {  
	            sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	}

}
