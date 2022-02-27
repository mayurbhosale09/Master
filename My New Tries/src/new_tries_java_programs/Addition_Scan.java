package new_tries_java_programs;

import java.util.Scanner;

public class Addition_Scan {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter value of a");
		
		a=in.nextInt();
		
		System.out.println("enter value of b");
		
		b=in.nextInt();
		
		//to add two numbers
		
		c= a+b;
		
		System.out.println("Sum of two numbers is " +c);
		
		
	}

}
