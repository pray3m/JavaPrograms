/* 3. Run the program that demonstrate the multiple catch blocks. */

public class ExceptionDemo{
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = "+a);
            int [] c = {1};
            c[42] = 99;
        }catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println(" Program Flows After try/catch blocks.");
    }
}