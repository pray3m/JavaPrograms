// Q.N-7. Demonstrate the use of Scanner class

import java.util.Scanner;
public class inputDemo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a integer");
        int myInt=input.nextInt();
        System.out.println("Integer entered by user is : "+myInt);

        System.out.println("Enter a float: ");
        float myFloat=input.nextFloat();
        System.out.println("Float entered by user is : "+myFloat);

        System.out.println("Enter a double: ");
        double myDouble=input.nextDouble();
        System.out.println("Double entered by user is : "+myDouble);

        System.out.println("Enter a character: ");
        String myChar= input.next();
        System.out.println("String entered by user is: "+myChar);

    }
}
