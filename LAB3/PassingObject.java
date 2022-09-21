/* 11.  demonstrate the concept of object passing.*/

class Area{
    int length, breadth;

    Area(Area a){
        length=a.length;
        breadth=a.breadth;
    }

    Area(int l,int b){
        this.length=l;
        this.breadth=b;
    }

    void area(){
        System.out.println("The area is: "+length*breadth);
    }
}

public class PassingObject {
    public static void main(String[] args) {
        Area A1 = new Area(10, 20);
        Area A2 = new Area(A1);
        A2.area();
    }
}