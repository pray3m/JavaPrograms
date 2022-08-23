// Q.n-14 Write a program in Java to create the following shape

import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows in triangle:");
        int rows = input.nextInt();
        int number = 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
    }
}
