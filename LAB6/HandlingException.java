/*1. Run the following program and complete the program to demonstrate the concept of Exception
Handling or run time exception. */

public class HandlingException {
    public static void main(String[] args) {
        try {
            int d, a;
            d = 0;
            a = 34 / d;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("After catch statement program flows..");
    }
}