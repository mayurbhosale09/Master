package new_tries_java_programs;

public class Fibonacci_Without_Recursion {

	public static void main(String[] args) {
		
		int num1= 0, num2= 1, num3, i;
		
		//to print num1 and num2
		
		System.out.print(num1+ " " + num2);
		
		//to print 3rd number onwards
		
		for (i=2;i<=10;i++)
		
		{
		num3= num1 + num2;
			
		System.out.print(" " +num3);
		
		num1=num2;
		num2=num3;
		
		}
				
		
	}

}
