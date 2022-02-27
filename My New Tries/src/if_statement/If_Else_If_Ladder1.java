package if_statement;

import java.util.Scanner;

public class If_Else_If_Ladder1 {
	

	static int Abba;
	static int Dabba; 

	public static void main(String[] args) {


		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Abba's Age");
		Abba=in.nextInt();

		System.out.println("Enter Dabba's Age");
		Dabba=in.nextInt();

		if(Abba > Dabba) {

			System.out.println("Abba is Elder then Dabba");
		}

			else{
				System.out.println("Dabba is Elder than Abba");
			}



		}


	}
