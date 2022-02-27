package if_statement;

import java.util.Scanner;

public class NestedIf {

	static int Age;
	static String Country;
	static String India;

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in=new Scanner (System.in);

		System.out.println("Enter Your Age");

		Age= in.nextInt();

		System.out.println("Enter Your Country");

		Country = in.next();
 
		if(Age > 18) {

			if(Country.equals("India")) {
			
			System.out.println("Elegible to Cast a Vote");
			}
		else {
			System.out.println("Ineligible to Cast a Vote");

		}

		}
				
		}
		
	}
		

	
