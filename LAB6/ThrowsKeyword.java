/* 5. Demonstration of Throws Keyword */

public class ThrowsKeyword{
    int division (int a, int b) throws ArithmeticException{
        int t = a / b;
        return t;
    }
    
    public static void main(String[] args) {
        try {
            ThrowsKeyword a = new ThrowsKeyword();
            a.division(10, 0);
        }catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}