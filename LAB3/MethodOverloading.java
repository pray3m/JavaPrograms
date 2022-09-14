/* 10. Complete the following program that demonstrate the concept of constructor overloading. */

/*
 * author: @pray3m
 */

class Box3 {
    double width, height, depth;
    // constructor used when all dimensions // specified
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
    }

    Box3( double d) {
        width = height = depth =d ;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
    // create boxes using the various constructors
        Box3 mbox1 = new Box3(10, 20, 15);
        Box3 mbox2 = new Box3();
        Box3 mbox3 = new Box3(7);

        double vol;
    // get volume of first box
        vol = mbox1.volume();
        System.out.println(" Volume of with 3 parameters is " + vol);

        vol = mbox2.volume();
        System.out.println(" Volume of with no parameters is " + vol);

        vol = mbox3.volume();
        System.out.println(" Volume of cube " + vol);
    }
}
