// Q.N-4 Complete the following program in Java to demonstrate the Boolean values.

public class booleanTest {
    public static void main(String[] args){
        boolean b;
        b=false;
        System.out.println("b is "+ b);
        System.out.println("b is " + !b);

        if(b) System.out.println("This is executed.");
        b=false;
        if(b) System.out.println("This is not executed.");
        System.out.println("10 > 9 is "+(10>9));

    }
}
