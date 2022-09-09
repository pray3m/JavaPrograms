/* 3. Write a program in Java to create a class Box with instance variables length, width, and
height, add method volume that returns some value, Also add a method setDimension() that takes
parameters. Create at least 2 objects from the class Box and calculate volume of each Box object. */

class Box{
    double length;
    double width;
    double height;

    void setDimension(double l,double b,double h ){
        length=l;
        width=b;
        height=h;
    }

    double volume(){
        return length*width*height;
    }
}

public class VolumeDemo {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box();
        b1.setDimension(4,7,9);
        b2.setDimension(3,2,7);

        System.out.println("The volume of box1 is : "+ b1.volume());
        System.out.println("The volume of box2 is : "+ b2.volume());
    }
}
