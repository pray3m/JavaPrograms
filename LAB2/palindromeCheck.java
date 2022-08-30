/* 27. Write a Java program that checks whether a given string is a palindrome or not. */

import java.util.Scanner;

public class palindromeCheck {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter any string: ");
    String text=s.next();
   
    //checking whether palindrome or not
    if(isPalindrome(text))
        System.out.println("palindrome !!!");
    else{
        System.out.println("not palindrome.");
    }

   }
   

   public static boolean isPalindrome(String str) {
    int left=0, right=str.length()-1;

    while(left<right){
        if(str.charAt(left)!=str.charAt(right))
            return false;
        left++;
        right--;
    }
    return true;
   }

}
