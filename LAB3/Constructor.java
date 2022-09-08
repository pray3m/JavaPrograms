/* Q.n.5 -> Complete the following program that demonstrate the concept of parameterized constructor. */

class Box{
    int length;
    int width;
    int height;

    //use parameterized constructor here
    Box(int l,int b,int h){
        length=l;
        width=b;
        height=h;
    }

    int volume(){
        return length*width*height;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Box box1=new Box(4,6,8);
        Box box2=new Box(6,8,2);
        System.out.println("The volume of first box is : "+box1.volume());
        System.out.println("The volume of second box is : "+box2.volume());
    }
}
