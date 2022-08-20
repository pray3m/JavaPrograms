// Q.N 23 - Create an array of integers, then print the odd and even number in an array

import java.util.Scanner;

public class oddEvenInArray {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int num=input.nextInt();
        int[] arr =new int[num];

        System.out.println("Enter any " + num +" elements of the array");
        for(int i=0;i<num;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("The even numbers are: ");
        for(int i=0;i<num;i++){
            if(arr[i] % 2 == 0) {
                System.out.printf(" "+arr[i]+" ");
            }
        }

        System.out.print(" \n The odd numbers are: ");
        for(int i=0;i<num;i++){
            if(arr[i] % 2 != 0) {
                System.out.print(" "+ arr[i]+" ");
            }
        }
    }
}
