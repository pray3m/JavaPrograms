/* 8. Complete the program in java to show the use of super keyword to invoke constructor of
 parent class. */

 /*
  * author: @pray3m
  */

class Person{
    Person(){
        System.out.println("Person class constructor");
    }
}

class Student extends Person{
    Student(){
        super(); //used super keyword here
        System.out.println("Student Class Constructor");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Student s=new Student();
    }
}