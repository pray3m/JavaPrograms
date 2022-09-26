/*4. Run the program and Demonstrate the keyword throw. Also answer why “static” keyword is
written in validate function. */

public class ThrowKeyword{
    static void validate (int age) {
        try {
            if (age < 18)
            throw new ArithmeticException("Not Valid");
            else
            System.out.println("Can vote");
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        validate(12);
    }
}