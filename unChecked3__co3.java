package oopsprograms;

public class unChecked3__co3 {
	public static void main(String[] args) 
	{
		String s = null;
		try
		{
			System.out.println(s.length());
		}
		catch (NullPointerException e)
		{
		  System.out.println("arey your are performing operations on null");
		}
	}
}


