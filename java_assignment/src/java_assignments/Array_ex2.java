package java_assignments;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		int r, s, row=5;   ////row denotes the number of rows you want to print     
		 
		for(r=0; r<row; r++)  //outer loop for rows  
		{    
		for(s=0; s<=r; s++)   //inner loop for columns 
		{      
		System.out.print(" * ");   //prints stars
		}   
		System.out.println();   //throws the cursor in a new line after printing each line  
		}   
	}

}
