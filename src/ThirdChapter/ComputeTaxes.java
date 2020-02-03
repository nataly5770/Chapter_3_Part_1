package ThirdChapter;

import java.util.Scanner;

public class ComputeTaxes {
    public static void main (String [] args){
        /*
        (Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the
        source code to compute taxes for single filers. Complete this program to compute
        taxes for all filing statuses.

         */
        Scanner input = new Scanner(System.in);

        //Prompt the user to find filing status
        System.out.print("0-single filter, ");

        //Prompt the user to enter taxable income
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();

        //Compute tax
        double tax = 0;

    }
}
