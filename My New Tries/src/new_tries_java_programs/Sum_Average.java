package new_tries_java_programs;

import java.util.Scanner;

public class Sum_Average {
	
	public static void main(String[] args) {
		
		int a, b, sum;
		float avg;
		
	Scanner in=new Scanner(System.in);
	
	System.out.println("enter value of a");
	
	a= in.nextInt();
	
	System.out.println("enter value of b");
	
	b=in.nextInt();
	
	//to calculate sum
	
	sum=a+b;
	
	avg= (a+b)/2;
	
	System.out.println("Sum of two numbers is= " +sum +"\naverage of two numbers is " +avg);
	

	
	
		
	}

}
