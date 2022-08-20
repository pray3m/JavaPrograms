/* Q.N-29  Write a program that prompts two number from the user and add them to give the sum of
those number. Make a separate function to sum the numbers. */

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a=input.nextInt();
        int b= input.nextInt();

        System.out.println("The Sum is : " + sumNum(a,b));
    }

    public static int sumNum(int x, int y) {
        return x + y;
    }
}


