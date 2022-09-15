/* 1. Demonstrate the feature of simple inheritance */

/*
 * author : @pray3m
 */

class Animal{
    void eat(){
        System.out.println("I can eat.");
    }

    void sleep(){
        System.out.println("I can sleep.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("I can Bark.");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();
    }
}
