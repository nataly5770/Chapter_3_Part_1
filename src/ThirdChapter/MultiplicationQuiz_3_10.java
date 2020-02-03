package ThirdChapter;

import java.util.Scanner;

public class MultiplicationQuiz_3_10 {
    public static void main(String[] args) {

        /*
        (Game: multiplication quiz) Listing 3.3, SubtractionQuiz.java, randomly generates
        a subtraction question.

        Revise the program to randomly generate a multiplication question with two integers less than 1000.

        Here I have added an extra row to add 3 instead of 2 digits that are larger than 1000

         */

        Scanner input = new Scanner(System.in);

        //Generate 3 integers less then 1000

        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);
        int number3 = (int)(Math.random() * 1000);

        //Ask the user to enter an answer
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 +" ? ");
        int answer = input.nextInt();

        //Display result
        if
        (number1 + number2 + number3 == answer)
        System.out.println("You answered correctly!");
        else
        System.out.println("You answered incorrectly " + number1 + " + " + number2 + " + " + number3 +" should be " + (number1 + number2 + number3));

    }
}
