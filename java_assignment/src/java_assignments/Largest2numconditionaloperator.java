package java_assignments;

import java.util.Scanner;

public class Largest2numconditionaloperator {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int num1;
int num2;
int result;
System.out.print(" Please Enter the First Num : ");
num1 = sc.nextInt();	

System.out.print(" Please Enter the Second Num : ");
num2 = sc.nextInt();	
/*int num3=75;
int result=(num1>num2 && num1>num3)? num1: ((num2>num3 && num2>num1)?num2:num3);*/
result=(num1>num2)? num1:num2;
{
System.out.println(result);
	}

	}
}
