package ThirdChapter;

import java.util.Scanner;

public class Lottery_3_15 {
    public static void main(String[] args) {


    /*
    (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit
number.

The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules:

1. If the user input matches the lottery number in the exact order, the award is $12,000.
2. If all digits in the user input match all digits in the lottery number, the award is $5,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $2,000.
     */

        Scanner input = new Scanner(System.in);


        //generating a random 3 digit number
        int number = (int) (Math.random() * 1000);

        //ask the user to enter a 3 digit number
        System.out.print("Please enter a 3 digit number: ");

        int guess = input.nextInt();

        //Taking digits out from lottery
        int numberDigit1 = number / 100;
        int remainingDigits = number % 100;
        int numberDigit2 = remainingDigits / 10;
        int numberDigit3 = remainingDigits % 10;


        //extracting digit from number
        int guessDigit1 = guess / 100;
        int remainingDigits2 = guess % 100;
        int guessDigit2 = remainingDigits2 / 10;
        int guessDigit3 = remainingDigits2 % 10;

        System.out.println("This lottery number is " + number);


        //check whether what the user guessed was correct
        if (number == guess)
            System.out.println("Great, this is exact match> you just won $10 000");
        if (numberDigit1 == guessDigit2) {

        }


    }
}
