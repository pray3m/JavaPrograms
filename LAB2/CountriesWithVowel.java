// Write a program that asks the user to enter names of any 7 countries. Then the user is
//required to count and display those countries that ends with a vowel

import java.util.Scanner;

public class CountriesWithVowel {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of countries");
        int num=input.nextInt();
        String[] countries =new String[num];

        System.out.println("Enter any "+ num+" countries ?");
        for(int i=0;i<num;i++){
            countries[i]=input.next();
        }

        int count=0;
        System.out.println("The countries ending with vowel are: ");
        for(int i=0;i<num;i++){
            char lastLetter = countries[i].charAt(countries[i].length() - 1);
            if((lastLetter == 'a') ||
                    (lastLetter == 'e') ||
                    (lastLetter == 'i') ||
                    (lastLetter == 'o') ||
                    (lastLetter == 'u')){
                System.out.println(countries[i]);
                count++;
            }
        }

        System.out.println("There are " +count+" countries ending with vowels. ");
    }
}
