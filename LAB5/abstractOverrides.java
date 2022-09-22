/* 3. Create an abstract class Fmachine, having methods getdata() and putdata(). Derive a class
Airplane, having instance variables code, name, capacity and methods getdata() and putdata()
(that overrides Fmachine's getdata() and putdata()) to ready and display the result. Create some
instances of Airplane and call the required methods.*/

/*
 * author: @pray3m
 */

abstract class Fmachine{
    abstract void getData(int code,String name,int capacity);
    abstract void putData();
}

class Aeroplane extends Fmachine{
    int code;
    String name;
    int capacity;
    void getData(int code, String name,int capacity){
        this.code=code;
        this.name=name;
        this.capacity=capacity;
    }

    void putData(){
        System.out.printf("\n Code:%d \n Name:%s \n Capacity:%d",code,name,capacity);
    }
}

public class abstractOverrides {
    public static void main(String[] args) {
        Aeroplane a=new Aeroplane();
        a.getData(23221, "AirBus121",69);
        a.putData();
    }
}
