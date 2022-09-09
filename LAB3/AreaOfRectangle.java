/* 7. Make class "Rectangle" with attributes length and breadth. The class contains methods
computeArea and displayArea. Write a program with main method that creates two objects of
Rectangle class and find their areas and display area of larger rectangle. */

class Rectangle{
    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    int computeArea(){
        return length*breadth;
    }

    void displayArea(){
        System.out.println("Area of larger rectangle is :"+computeArea());
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2=new Rectangle(6,8);
              
       if(r1.computeArea() > r2.computeArea())
        r1.displayArea();
       else
        r2.displayArea();
    }
}
