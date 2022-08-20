/* Q.n-30 Write a method that takes two integer as parameters and adds up all the numbers from the
first number to last and print the sum. */

import java.util.Scanner;
public class SumOfRange {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter any two numbers :");
        int a=input.nextInt();
        int b= input.nextInt();
        System.out.print("the series of number is : ");
        for(int i=a;i<=b;i++){
            System.out.print(i+ " , ");
        }
        System.out.println("\nthe total sum is "+calcSum(a,b));
    }

    public static int calcSum(int x,int y){
        int sum=0;
        for (int i = x; i <= y; i++) {
            sum+=i;
        }
        return sum;
    }
}
