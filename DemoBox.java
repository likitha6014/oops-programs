package oopsprograms;

public class DemoBox {

    
    static class Box {
        double width;
        double height;
        double depth;

       
        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        // Method to calculate volume
        double volume() {
            return width * height * depth;
        }
    }

    
    public static void main(String[] args) {
        
        Box mybox = new Box(10, 20, 15);

        
        double vol = mybox.volume();
        System.out.println("Volume is " + vol);
    }
}
