/*5. Complete the following program using the concept of interface. */

/*
 * author: @pray3m
 */

interface Polygon{
    void getArea(int length,int breadth);
}

class Rectangle implements Polygon{
    public void getArea(int length,int breadth){
        System.out.println("The area of rectangle is : "+(length*breadth));
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.getArea(4,6);
    }
}
