/* 18. A school has following rules for grading system:
a. Below 25 – F
b. 25 to 45 – E
c. 45 to 50 – D
d. 50 to 60 – C
e. 60 to 80 – B
f. Above 80 – A
Ask user to enter marks and print the corresponding grade.
*/

import java.util.Scanner;

public class calcGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks :");
        int marks= input.nextInt();

        if (marks>=80)
            System.out.println("A");
        else if(marks>=60)
            System.out.println("B");
        else if (marks>=50)
            System.out.println("C");
        else if(marks>=45)
            System.out.println("D");
        else if(marks>=25)
            System.out.println("E");
        else
            System.out.println("F");

    }
}
