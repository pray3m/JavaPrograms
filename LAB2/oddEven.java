//Q.N-8 Write a program in Java to check a number is even or odd.

import java.util.Scanner;
public class oddEven {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Even Number.");
        }else{
            System.out.println("Odd Number.");
        }
    }
}
