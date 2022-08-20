/* 17. Write a program in Java that takes user input character from the alphabet and prints
VOWEL or CONSONANT. If the user input is not a letter i.e. between 'a' and 'z' or 'A and 'Z',
then prints "not an alphabet." */

import java.util.Scanner;
public class checkAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch=input.next().charAt(0);  //takes character input

        //condition for vowels
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
                (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') ){
            System.out.println("VOWEL");
        }

        //condition for consonants
        else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            System.out.println("CONSONANT");
        }else{
            System.out.println("Not an alphabet.");
        }
    }
}
