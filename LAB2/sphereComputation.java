/* 20. Write a program called sphere computation that prompts user for the radius of a sphere in
floating point number. The program shall read the input as double; compute the volume and
surface area of the sphere in double; and print the values rounded to 2 decimal places. */

import java.util.Scanner;

public class sphereComputation {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius= input.nextDouble();
        double pi=3.1415;
        double surfaceArea= 4 * pi * radius * radius;
        double volume= (4/3) * pi * radius * radius * radius;

        //prints the variables rouded to 2 decimal places
        System.out.printf("Volume of sphere: %.2f \n",volume);
        System.out.printf("Surface area of sphere: %.2f \n",surfaceArea);

        //to remove the memory leak
        input.close();
    }
}
