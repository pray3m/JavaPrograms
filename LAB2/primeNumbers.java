/* 21. Write a Java program that prompts the user for an integer and then prints out all prime
numbers up to that integer. */

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=input.nextInt();
        int flag;

        for(int i=2;i<num;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    flag++;
            }
            
            if(flag==0)
                System.out.println(i);
        }
        
    }
}