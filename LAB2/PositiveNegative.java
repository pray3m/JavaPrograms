/* 15. Write a Java program to get number from the user and print whether it is
 a positive or negative. */

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no. to be checked ?");
        int num= input.nextInt();
        if (num>0){
            System.out.println("The num is positive.");
        }else {
            System.out.println("The num is negative.");
        }
    }
}
