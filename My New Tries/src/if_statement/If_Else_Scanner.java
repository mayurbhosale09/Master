package if_statement;

import java.util.Scanner;

public class If_Else_Scanner {

	static int age; 
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);

		System.out.println("Enter your Age");
		age=in.nextInt();
		if(age > 21) {

			System.out.println("Eligible for Casting Your Vote");
		}

		else {
			System.out.println("Ineligible for Casting Your vote");
		}


	}

}
