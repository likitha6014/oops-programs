package polymorphisim;
public class finalme {
    public static void main(String[] args) {
        int x = 10;           
        final int y = 20;     

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        x = 30;               
       // y = 40;            

       System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}