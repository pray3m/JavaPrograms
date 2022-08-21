// 12. Write a program to display the Fibonacci series based on the user input.

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int num= input.nextInt();
        for (int i=0;i<num;i++){
            System.out.println(fib(i));
        }
    }

        public static int fib(int x){
        if (x==0)
            return 0;
        else if (x==1)
            return 1;
        else{
            return (fib(x-1)+fib(x-2)); // sum of previous two numbers
        }
        }
}

