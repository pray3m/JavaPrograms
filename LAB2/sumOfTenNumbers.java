// Q.N-10. Write a program to get sum of 10 numbers
import java.util.Scanner;
public class sumOfTenNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any ten numbers: ");
        int[] num=new int[10];
        for (int i=0;i<10;i++){
            num[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=num[i];
        }
        System.out.println("The sum is: "+ sum);
    }
}
