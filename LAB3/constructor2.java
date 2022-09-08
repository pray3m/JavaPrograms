/* 6. Use keyword "this" in the Q.N-5 program and illustrate the demonstration. */

class Box{
    int length;
    int width;
    int height;

    //use parameterized constructor here
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    int volume(){
        return length*width*height;
    }
}

public class constructor2 {
    public static void main(String[] args) {
        Box box1=new Box(4,6,8);
        Box box2= new Box(6,8,2);
        System.out.println("The volume of first box is : "+box1.volume());
        System.out.println("The volume of second box is : "+box2.volume());
    }
}
