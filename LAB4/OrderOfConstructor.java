/*9. Write a program in java to demonstrate the order of constructor in multilevel inheritance. To
do so, create a class A, than a class B that is inherited from class A, again create class C that is
inherited from class B.*/

/*
 * author: @pray3m
 */

class A{
    A(){
        System.out.println("Constructor A");
    }
}

class B extends A{
    B() {
        System.out.println("Constructor B");
    }
}

class C extends B{
    C() {
        System.out.println("Constructor C");
    }
}

public class OrderOfConstructor {
    public static void main(String[] args) {
        C c=new C();
    }
}
