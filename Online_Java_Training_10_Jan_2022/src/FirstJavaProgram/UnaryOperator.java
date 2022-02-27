package FirstJavaProgram;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int a = 10;

		System.out.println(a++); // 10 (11)
		
		System.out.println(a);

		System.out.println(a++ + ++a); // 11 (12) 13 (13)

		System.out.println(a); // 13
		
		System.out.println(a--); // 13 (12)
		
		System.out.println(a); // 12
		
		System.out.println(a-- + --a); // 12 (11) (10) 10
		
		System.out.println(a);
		
		System.out.println(a++ + a++); // 10 (11) 11 (12)
		
		System.out.println(a-- + a-- - ++a + ++a - --a); // 12 (11) 11 (10) 11 (11) 12 (12) 11 (11)
		
		System.out.println(a-- +  --a - a++ - ++a + --a + a++ + ++a ); // 11 (10) 9 (9) 9 (10) 11 (11) 10 (10) 10 (11) 12 (12)

	}

}
