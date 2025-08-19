package polymorphisim;
		
class One 
{
   int i=10;

void show()
{
 System.out.println(" i=" +i );
}
}

class Two extends One
{
  int i=20;

void show()
{
System.out.println("i=" +i);
super.show();
System.out.println("super i="+ super.i);
}
}


class super2
{
public static void main(String args [])
 {
Two t=new Two();
    t.show();
   }
}

