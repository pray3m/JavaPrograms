/*4. Complete the following program in java that demonstrate the feature of inheritance. */

/*
 * author: @pray3m
 */

class Box {
    double width;
    double height;
    double depth;
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double w, double h, double d, double m) {
        this.width=w;
        this.height=h;
        this.depth=d;
        this.weight=m;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(3, 4, 5, 0.043);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
    }
}