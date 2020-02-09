package ThirdChapter;

import java.util.Scanner;

public class PointOnLineSegment_3_34 {
    public static void main(String[] args) {

        /*
        (Geometry: point on line segment)

        Exercise 3.32 shows how to test whether a point is on an unbounded line.
        Revise Exercise 3.32 to test whether a point is on a line segment.

        Write a program that prompts the user to enter the three points for p0,
        p1, and p2 and displays whether p2 is on the line segment from p0 to p1.
         */

        Scanner input = new Scanner(System.in);

        //Ask the user to insert 3 points as requested in an exercise for p0, p1 and p2

        System.out.println("Please enter 3 points for p0, p1 and p2: ");
        double a0 = input.nextDouble();
        double b0 = input.nextDouble();

        double a1 = input.nextDouble();
        double b1 = input.nextDouble();

        double a2 = input.nextDouble();
        double b2 = input.nextDouble();

        //calculating point in on line segment
        boolean online =
                !(((a1 - a0) * (b2 - b0) - (a2 - a0) * (b1 - b0)) > 0 ||
                        ((a1 - a0) * (b2 - b0) - (a2 - a0) * (b1 - b0)) < 0 ||
                        (b2 < a0) || (b2 < b0) || (a2 > a1) || (b2 > b1));
//displaying the result

        System.out.println("(" + a2 +", " + b2 + ") is ");

        if(!online)
            System.out.print("not ");
        System.out.println(" on the line segment from (" + a0 + ", " + b0 +
                ") to (" + a1 + ", " + b1 + ")");
    }
}
