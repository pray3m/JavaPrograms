/* 4. Complete the following program that demonstrate the concept of constructor */

/*
 * author: @pray3m
 */

class Box{
    double width;
    double height;
    double length;
// use default constructor here
    Box(double width,double height,double length){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    double volume(){
        return width*height*length;
    }
}
public class BoxxDemo{
    public static void main(String[] args){
        Box box1 = new Box(4,6,7);      
        double vol;
        vol = box1.volume();
        System.out.println("The volume is : "+vol);
    }
}