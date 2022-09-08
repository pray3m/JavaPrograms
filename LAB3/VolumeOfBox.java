
/* 2. Write a program in Java to create a class Box with instance variables length, width, and
height, add method volume that returns some value. Create at least 2 objects from the class Box
and calculate volume of each box object. */

class Box{
    int length;
    int width;
    int height;

    int calcVolume(){
        return length*width*height;
    }
}


public class VolumeOfBox {
    public static void main(String[] args) {
        Box box1=new Box();
        Box box2=new Box();
        double vol1,vol2;
    
        //assign values of box instance variables
        box1.length=6;
        box1.height=7;
        box1.width =8;
    
        box2.length=12;
        box2.width =43;
        box2.height=3;
    
        // compute volume
        vol1= box1.calcVolume();
        vol2= box2.calcVolume();
    
        System.out.println("Volume of box1 is : "+vol1);
        System.out.println("Volume of box2 is : "+vol2);
    }    
}
