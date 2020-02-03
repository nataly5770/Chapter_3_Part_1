package ThirdChapter;

import java.util.Scanner;

public class SortThreeIntegers_3_8 {
    public static void main(String[] args) {
        /*
        (Sort three integers) Write a program that prompts the user to enter three integers
        and display the integers in non-decreasing order.
         */

        Scanner input = new Scanner(System.in);

        // Ask the user to insert 3 integers
        System.out.println("Enter 3 integers: ");

        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();

        // Sorting numbers
        int usersNumber;

        if (integer2 < integer1 || integer3 < integer1)

        {

            if (integer2 < integer1)
            {
                usersNumber = integer1;
                integer1 = integer2;
                integer2 = usersNumber;

            }

            if (integer3 < integer1)
            {

                        usersNumber = integer1;
                        integer1 = integer3;
                        integer3 = usersNumber;

                    }
                }

                if (integer3 < integer2)

                {
                    usersNumber = integer2;
                    integer2 = integer3;
                    integer3 = usersNumber;
                }

                //Displaying integers in ascending order
                System.out.println(integer1 + " " + integer2 + " " + integer3);
            }
        }



