// 19. Write a program to print first 20 Fibonacci numbers and compute their average.

import java.util.Scanner;
public class avgFibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int total = 0;
        for(int i=0;i<20;i++){
            int num=(fib(i));
            System.out.println(num);
            total += num;
        }

        System.out.println("Average: "+(total/20));
    }

    // function to calculate fibonacci
    public static int fib(int x){
        if(x==0)
            return 0;
         else if(x==1)
            return 1;
        else {
            return (fib(x - 1) + fib(x - 2));
        }
    }

}
