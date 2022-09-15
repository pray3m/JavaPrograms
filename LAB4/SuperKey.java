/* Q.N 6 Java program to access the parent class data item from child class by using super keyword. */

/*
 * author: @pray3m
 */

class superclass{
    int num=100;
}

class subclass extends superclass{
    int num=200;
    void display(){
        System.out.println("The number of superclass is : "+ super.num);
        System.out.println("The number of subclass is : "+num);
    }
}

public class SuperKey {
    public static void main(String[] args) {
        subclass s1=new subclass();
        s1.display();
    }
}
