/* 2. Find the problem and complete the following program. */

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[5]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Program flows..");
    }
}