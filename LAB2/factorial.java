// Q.N-13 Write a program for finding factorial of a number entered by user.

import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        int fact=1;
        while (num>0){
            fact*=num;
            num--;
        }
        System.out.println("the factorial is "+fact);
    }
}
