  package oopsprograms;

public class DemoBox3 {

    // Static nested class Box
    static class Box {
        double width;
        double height;
        double depth;

        // Method to calculate volume
        double volume() {
            return width * height * depth;
        }
    }

    public static void main(String[] args) {
        // Create Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // Assign values to mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Calculate and display volume of mybox1
        double vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // Assign values to mybox2
        mybox2.width = 5;
        mybox2.height = 6;
        mybox2.depth = 7;

        // Calculate and display volume of mybox2
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}