package oopsprograms;

public class uncheckedCo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program execution started");
		int n1 = 100;
		int n2 = 0;
		int result=0;
		try
		{
		result = n1 / n2; // Division 100
		} 
		catch(ArithmeticException ae)
		{
		System.out.println("Exception handled");
		}

		finally 
		{
		System.out.println("i am in finally block");
		}
		System.out.println("output: " + result);
	
		System.out.println("execution completed");
		}
		}

