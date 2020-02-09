package ThirdChapter;

import java.util.Scanner;

public class CompareCosts_3_33 {
    public static void main(String[] args) {
        /*
        Suppose you shop for rice in two different packages.

        You would like to write a program to compare the cost. The program prompts the
        user to enter the weight and price of each package and displays the one with the
        better price.
         */

        Scanner input = new Scanner(System.in);

        //Ask the use to enter the weight and price of each package

        System.out.println("Enter weight and price for package 1: ");

        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.println("Enter weight and price for package 2: ");

        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 / price2 < price2 / weight2)
            System.out.println("Package 1 has a better price.");

        else if (price1 / weight1 > price2 / weight2)

            System.out.println("Package 2 has a better price. ");

        else System.out.println("Two packages have the same price.");

    }
}
