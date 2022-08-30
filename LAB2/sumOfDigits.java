/* 28. Write a program that prompts user for a positive integer. The shall read the input as int;
compute and print the sum of all its digits. */

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int digit=0;
        int sum=0;

        while(num>0){
            digit=num%10;
            sum+=digit;
            num/=10;
        }

        System.out.println("The sum of digits is: "+sum);
    }
    
}
