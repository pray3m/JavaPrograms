/* 8. Modify the Q>N 7 by entering the variable
values from the keyboard to calculate and display area of rectangle.*/ 

/*
 * author: @pray3m
 */

import java.util.Scanner; 

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

public class ComputeAreaofRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length and breadth of first rectangle : ");
        int l1=input.nextInt();
        int b1=input.nextInt();

        System.out.println("Enter the length and breadth of another rectangle : ");
        int l2=input.nextInt();
        int b2=input.nextInt();
        
        Rectangle r1=new Rectangle(l1,b1);
        Rectangle r2=new Rectangle(l2,b2);

        if(r1.computeArea() > r2.computeArea())
        r1.displayArea();
       else
        r2.displayArea();
    }
}
