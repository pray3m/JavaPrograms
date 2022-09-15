/* 7. Java program to show the use of Super keyword to invoke parent class method */

/*
 * author: pray3m
 */

class Animals{
    public void animalSound(){
        System.out.println("The animal makes a sound.");
    }
}

class Cats extends Animals{
    public void animalSound(){
        System.out.println("The cat says:  meow meow ");
    }

    void display(){
        super.animalSound();
        animalSound();
    }
}

public class superMethod {
    public static void main(String[] args) {
        Cats c1=new Cats();
        c1.display();
    }
}
