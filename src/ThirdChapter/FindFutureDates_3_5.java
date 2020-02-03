package ThirdChapter;

import java.util.Scanner;

public class FindFutureDates_3_5 {
    public static void main(String[] args) {
        /*
        (Find future dates) Write a program that prompts the user to enter an integer for
        today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
        prompt the user to enter the number of days after today for a future day and display
        the future day of the week.
         */

        Scanner input = new Scanner(System.in);

        //We are asking the user to enter an integer for today's day of the week

        System.out.print("Enter today's day of the week: ");
        int day = input.nextInt();


        // Now, according to the exercise we ask thr user to enter the number of days after today
        System.out.print("Enter the number of days after today: ");
        int daysAfterToday = input.nextInt();


        //And now, we need to calculate future day
        int futureDay = (day + daysAfterToday) % 7;

        System.out.print("Today is ");

        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;

        }

        System.out.print(" and the future day is ");

        switch (futureDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

        }

    }

}
