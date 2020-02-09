package ThirdChapter;

import java.util.Scanner;

public class PointInACircle_3_22 {
    public static void main(String[] args) {

        /*
        Write a program that prompts the user to enter a point (x, y) and checks whether the point
        is within the circle centered at (0, 0) with radius 10.

        For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as
        shown in Figure 3.7a.

         */

        Scanner input = new Scanner(System.in);

        //Asking the user to enter some point
        System.out.println("Enter some point with 2 coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Checking whether the point is within the circle
        boolean withinTheCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        //Displaying the result
        System.out.println("Point (" + x + ", " + y + ") is " + ((withinTheCircle) ? "in " : "not in ") + "the circle");
    }
}
