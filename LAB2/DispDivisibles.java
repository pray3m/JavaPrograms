/* Q.n-24 Write a Java program that asks the user to enter numbers in an array of size 'n'. Then
displays only the numbers that are divisible by 2 and 3. */

import java.util.Scanner;
public class DispDivisibles {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+" numbers ?");

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }

        System.out.print("The numbers divisible by 2 and 3 are:");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0 && arr[i]%3==0)
                System.out.print(arr[i]+" ");
        }
    }

}
