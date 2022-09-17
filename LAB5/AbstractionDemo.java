/* 2. Create an abstract class shape with variables dim1 and dim2 and abstract method area() along
with the constructor. Derive a class rectangle and triangle from class shape and calculate the
area of rectangle and triangle. */

/*
 * author: @pray3m
 */

abstract class Shape{
    int dim1;
    int dim2;
    abstract int calcArea();

    Shape(int dim1,int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}

class rectangle extends Shape{
    rectangle(int a,int b){
        super(a,b);
    }

    int calcArea(){
        return dim1*dim2;
    }

}

class triangle extends Shape{
    triangle(int a,int b){
        super(a,b);
    }

    int calcArea(){
        return (int) (0.5*dim1*dim2);
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {
        rectangle r1=new rectangle(3,4);
        triangle t1=new triangle(3,4);
        System.out.println("The area of rectangle is : "+ r1.calcArea());
        System.out.println("The area of triangle is : "+ t1.calcArea());
    }
}
