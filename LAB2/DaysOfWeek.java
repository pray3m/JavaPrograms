//16. Write a Java program that takes input from 1 to 7, and display the name of the weekday.

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Choose a number (1-7)");
        int choice= input.nextInt();
        switch (choice){
            case 1:
                System.out.println("SUNDAY!");
                break;
            case 2:
                System.out.println("MONDAY!");
                break;
            case 3:
                System.out.println("TUESDAY!");
                break;
            case 4:
                System.out.println("WEDNESDAY!");
                break;
            case 5:
                System.out.println("THURSDAY!");
                break;
            case 6:
                System.out.println("FRIDAY!");
                break;
            case 7:
                System.out.println("SATURDAY!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
