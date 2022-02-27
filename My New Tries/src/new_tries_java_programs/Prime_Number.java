package new_tries_java_programs;

public class Prime_Number {

	public static void main(String[] args) {
		
		int i, num1= 29;
		
		Boolean A = false;
		
		for (i=2;i<=num1/2;i++) {
		
		if (num1%i ==0) {
			A = true;
			break;
		}
		}
		
	if (!A)
		
		System.out.println(num1+ " is a prime number");
	
	else
		System.out.println(num1+ " is not a prime number");
			
		
			
		

	}

}
