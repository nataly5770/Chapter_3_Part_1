package ThirdChapter;

import java.util.Scanner;

public class AdditionQuiz_3_2 {

    public static void main(String[] args) {

        /*
        (Game: multiply three numbers) The program in Listing 3.1, AdditionQuiz.java,
        generates two integers and prompts the user to enter the product of these two integers.
        Revise the program to generate three single-digit integers and prompt the user
        to enter the multiplication of these three integers.
         */



        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 10 % 10 % 10);

        //Create a scanner

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + " ? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 * number2 * number3 == answer));

    }
}
