/* 3. Demonstrate hierarchical inheritance */

/*
 * author : @pray3m
 */

class ClassA {
    void displayA(){
        System.out.println("This is the method of ClassA");
    }
}

class ClassB extends ClassA{
    void displayB(){
        System.out.println("This is the method of classB");
    }
}

class ClassC extends ClassA{
    void displayC(){
        System.out.println("This is the method of classC");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        ClassC c1=new ClassC();
        c1.displayA();
        c1.displayC();

        classB b1=new classB();
        b1.displayA();
        b1.displayB();
    }
}
