package new_tries_java_programs;

public class StaticAndObjectCallingMethod {

	//user defined static method

	static void mayurMethod()

	{
		System.out.println("mayurMethod is called");
	}

	//user defined non static method
	void abhuMethod()

	{
		System.out.println("abhuMethod is called");
	}

	public static void main(String[] args) {

		//calling the static method without using object
		mayurMethod();


		//calling a non static method by creating an object of the class
		StaticAndObjectCallingMethod O = new StaticAndObjectCallingMethod();

		O.abhuMethod();	

	}

}

