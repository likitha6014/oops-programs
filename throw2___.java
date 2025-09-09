package oopsprograms;

public class throw2___ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner obj = new java.util.Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		try
		{
		  if(a==b)
		         throw new Exception("a and b are equal, i cannot add");
		  else
			System.out.println(a+b);
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("program execution completed");
		}	


	}

}
