/* 10. Run the following program in Java, that demonstrate the concepts of method overriding and
run time polymorphism. NOTE: read the comment properly, it may confuse you. */

// Base Class
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
//Override
    void show() {
        System.out.println("Child's show()");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
// If a Parent type reference refers to a Parent object, then Parent's show is called
        Parent obj1 = new Parent();
        obj1.show();
// If a Parent type reference refers to a Child object Child's show() is called RUN TIME POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}