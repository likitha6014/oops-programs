package polymorphisim;
class sample
{

void add(int   a,int  b)
{
	System.out.println("sum of two="+(a+b));
}


void add(int   a, int   b, int   c)
{
	System.out.println("sum of two="+(a+b+c));
}

void add(double  x, int   y)
{
	System.out.println("sum of two="+(x+y));
}  

}

public class overloading {

	public static void main(String[] args) {
		
		sample s1=new sample();
	    s1.add(10,20);
	    s1.add(10,15,20);
	    s1.add(5.5,50);

	}

}
