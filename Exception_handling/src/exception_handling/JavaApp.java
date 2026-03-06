package exception_handling;

public class JavaApp {
	public static void execution() {
		int i = 10;
		System.out.println(i);
		int j = 0;
		System.out.println(j);
		try {
			int k = i/j; 
			System.out.println("k is: " +k);
			System.out.println("Trying to do something");
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("Cannot divide any number by zero.");
		}
				
		
	}

}
