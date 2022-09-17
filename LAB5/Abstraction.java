/* 1. Create an abstract class animal for the following program and complete it. */

/*
 * author: @pray3m
 */

abstract class animal{
    abstract void makeSound();
}

class dog extends animal{
        void makeSound(){
            System.out.println("bow bow !");
        }
    }

    class cat extends animal{
        void makeSound(){
            System.out.println("meow meow !");
        }
    }

    public class Abstraction {
        public static void main(String[] args) {
            dog d1= new dog();
            d1.makeSound();
            cat c1= new cat();
            c1.makeSound();
        }
    }
