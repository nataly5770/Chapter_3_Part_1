package ThirdChapter;

import java.util.Scanner;

public class CostOfShipping_3_18 {
    public static void main(String[] args) {
        /*
        Cost of shipping)
        A shipping company uses the following function to calculate
        the cost (in dollars) of shipping based on the weight of the package (in kg).

        c(w) = d
        2.5, if 0 < w <= 2
        4.5, if 2 < w <= 4
        7.5, if 4 < w <= 10
        10.5, if 10 < w 6 <= 20

        Write a program that prompts the user to enter the weight of the package and
        display the shipping cost. If the weight is greater than 20, display a message “the
        package cannot be shipped.”


         */

        Scanner input = new Scanner(System.in);


        //ask the user to enter the weight of the package
        System.out.println("Enter the weight of the package you are about to ship: ");
        double weight = input.nextDouble();

        //calculating the cost
        if (weight > 50)
            System.out.println("The package is too large and cannot be shipped. ");
        else {
            double costPerEUR;
            if (weight > 0 && weight <= 1)
                costPerEUR = 3.5;
            else if (weight <= 3)
                costPerEUR = 5.5;
            else if (weight <= 10)
                costPerEUR = 8.5;
            else //if (weight <= 20)
                costPerEUR = 10.5;
            System.out.println("Shipping cost of package is $" +
                    costPerEUR * weight);
        }

    }
}
