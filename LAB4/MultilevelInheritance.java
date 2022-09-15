/*2. Demonstrate multi-level inheritance in Java */

/*
 * author : @pray3m
 */

class classA {
    void displayA(){
        System.out.println("This is the method of ClassA");
    }
}

class classB extends classA{
    void displayB(){
        System.out.println("This is the method of classB");
    }
}

class classC extends classB{
    void displayC(){
        System.out.println("This is the method of classC");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        classC c1=new classC();
        c1.displayA();
        c1.displayB();
        c1.displayC();
    }
}
