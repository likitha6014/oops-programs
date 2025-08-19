package polymorphisim;
class One1
{
	   One1()
	{
	System.out.println("one");
	}
}

class Two2 extends One1
{
      Two2()
   {
 	System.out.println("Two");
      }
 }
class Super2
{
public static void main(String args[])
{
Two2 t=new Two2();
   } 
  }
