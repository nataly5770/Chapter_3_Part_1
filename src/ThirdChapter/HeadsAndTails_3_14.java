package ThirdChapter;

import java.util.Random;
import java.util.Scanner;

public class HeadsAndTails_3_14 {
    public static void main(String[] args) {

        /*
        (Game: heads or tails) Write a program that lets the user guess whether the flip of
        a coin results in heads or tails. The program randomly generates an integer 0 or 1,
        which represents head or tail. The program prompts the user to enter a guess, and
        reports whether the guess is correct or incorrect.
         */

        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int flipACoin = random.nextInt();

        System.out.println("Please enter 1 in case you would like to get a head and 0 in case you would like it to be a tail");
        
        int guess = input.nextInt();

        if(guess == flipACoin){
            System.out.println("You are absolutely right!");
        } else {
            System.out.println("Unfortunately, you are not right this time. ");
        }
    }
}
