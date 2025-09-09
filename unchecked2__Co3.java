package oopsprograms;

public class unchecked2__Co3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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



