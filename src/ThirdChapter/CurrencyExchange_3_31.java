package ThirdChapter;

import java.util.Scanner;

public class CurrencyExchange_3_31 {
    public static void main (String[] args ){
        /*
        Write a program that prompts the user to enter
        the exchange rate from currency in U.S. dollars to Chinese RMB.

        Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
        Chinese RMB to U.S. dollars.

        Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it
        to Chinese RMB or U.S. dollars, respectively.
         */
        Scanner input = new Scanner(System.in);

        // Asking the user to enter the exchange rate from USD to RMB
        System.out.print("Please enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        //Asking the user to enter 0 to convert from USD to RMB and 1 from RMB to USD
        System.out.print("Please enter 0 to convert US dollars to RMB and 1 to convert RMB into US dollars: ");
        int option = input.nextInt();

        //Asking the user to enter the amount in USD or RMB to convert it to RMB or USD accordingly

        double amount;
        switch (option)
        {
            case 0:
                System.out.print("Please enter USD amount: ");
                amount = input.nextDouble();
                System.out.print("$" + amount + " is " + (amount * exchangeRate) + "yuan");break;
            case 1:
                System.out.print("Please enter the RMB amount: ");
                amount = input.nextDouble();

                System.out.println (amount + " yuan is $" + ((int) ((amount * 100) / exchangeRate)) /100.0); break;
            default: System.out.println("Incorrect input");

        }



    }
}
