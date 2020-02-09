package ThirdChapter;

import java.util.Scanner;

public class PalindromeInteger_3_12 {
    public static void main(String[] args) {

        /*
        Write a program that prompts the user to enter a three-digit
        integer and determines whether it is a palindrome integer. An integer is palindrome
        if it reads the same from right to left and from left to right. A negative integer is
        treated the same as a positive integer.
         */

        Scanner input = new Scanner(System.in);

        //Ask the user to enter a 3-digit integer
        System.out.print("Enter a 3-digit integer: ");
        int number = input.nextInt();

        //Checking of there is a palindrome

        int number1 = (int)(number /100);
        int remaining = number % 100;
        int number3 = (int)(remaining % 10);

        //Showing the result
        System.out.println(
                number + ((number1 == number3)? " is a " : " is not a ") + "palindrome");

    }
}
