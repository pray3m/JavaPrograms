/* 25. Write a program that asks that user to enter elements in a matrix of size m x n and then
display the sum of elements. */

import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of matrix (m x n): ");
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] matrix=new int[m][n]; //2D array for matrix
        
        System.out.printf("Enter the %d elements of matrix: ",m*n);
        
        int sum=0;
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
                sum+=matrix[i][j];
            }
        }

        System.out.println("the sum of elements in matrix: "+sum);

    }
}
