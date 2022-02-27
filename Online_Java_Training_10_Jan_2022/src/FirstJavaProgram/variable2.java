package FirstJavaProgram;

public class variable2 {

	int a = 5;
	static int r = 55;

	public static void main(String[] args) {

		String s = "Test string";

		// Calculate length of string
		int lengthOfString = s.length();
		System.out.println(lengthOfString);

		variable2 V2 = new variable2();

		System.out.println(V2.a);
		System.out.println(r);

		mayurMethod();
		abhuMethod();

	}

	public static void mayurMethod() {

		int h=25;
		System.out.println(h);

	}

	public static void abhuMethod() {

		int l= 90;
		System.out.println(l);
		
	}
}
