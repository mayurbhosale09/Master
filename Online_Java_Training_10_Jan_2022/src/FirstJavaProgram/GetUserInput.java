package FirstJavaProgram;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		
		int a;
		float b;
		String s;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String");
		s=in.nextLine();
		System.out.println("You entered a String " +s);
		
		System.out.println("Enter a Float");
		b=in.nextFloat();
		System.out.println("You entered a Float " +b);
		
		System.out.println("Enter an Integer");
		a=in.nextInt();
		System.out.println("You entered an Integer " +a);
		
		System.out.println(a+b+ " " +s);
		

	}

}
