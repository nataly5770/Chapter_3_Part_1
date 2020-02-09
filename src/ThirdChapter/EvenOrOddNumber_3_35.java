package ThirdChapter;

import java.util.Scanner;

public class EvenOrOddNumber_3_35 {
    public static void main(String[] args) {
        /*
        (Even or odd number)

        Write a program that prompts the user to enter an integer and
        displays whether the integer is an odd number or not.
         */

        int d;
        System.out.println("Please enter an integer: ");
        Scanner input = new Scanner(System.in);

        d = input.nextInt();

        if ((d / 2) * 2 == d)
            System.out.println("Even");
        else
            System.out.println("Odd");


    }
}
