package ThirdChapter;

import java.util.Scanner;

public class ScissorsRockPapaer_3_17 {
    public static void main(String[] args) {
        /*

        (Game: scissor, rock, paper) Write a program that plays the popular scissor–rock–
        paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
        wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
        scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
        2 and displays a message indicating whether the user or the computer wins, loses,
        or draws. Here are sample runs:

         */

        Scanner input = new Scanner(System.in);
        // generating random integer 1, 2 or 3
        int computer = (int) (Math.random() * 3);

        //asking the user to enter a number 0, 1, or 2
        System.out.println("Scissor(0), rock(1), paper(2): ");
        int user = input.nextInt();

        System.out.println("The computer is ");

        switch (computer) {
            case 0:
                System.out.println("scissor.");
                break;
            case 1:
                System.out.println("rock.");
                break;
            case 2:
                System.out.println("paper.");
        }
        System.out.println("You are ");
        switch (user)
        {
            case 0:
                System.out.println("scissor"); break;
            case 1:
                System.out.println("rock");break;
            case 2:
                System.out.println("paper");
        }

        // Showing the result
        if (computer == user)
            System.out.println(" too. It is a draw");
        else
        {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if(win)
                System.out.println(". You won big time!");
            else
                System.out.println(". You lost");
        }

    }
}
