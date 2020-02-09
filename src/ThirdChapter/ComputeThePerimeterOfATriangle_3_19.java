package ThirdChapter;

import java.util.Scanner;

public class ComputeThePerimeterOfATriangle_3_19 {
    public static void main(String[] args) {
        /*
        (Compute the perimeter of a triangle) Write a program that reads three edges for a
        triangle and computes the perimeter if the input is valid. Otherwise, display that the
        input is invalid.

        The input is valid if the sum of every pair of two edges is greater than the remaining edge.

         */

        Scanner input = new Scanner(System.in);

        //Ask the user to enter three edges for a triangle
        System.out.println("Insert three edges for a triangle: ");

        System.out.print("Edge 1 points x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Edge 2 points x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Edge 3 points x, y:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Check if the input is valid

        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);


        if(!valid)

        {
            System.out.println("Input is invalid.");
            System.exit(1);
        }

        //Calculating the sides of the triagle
        double side1 = Math.pow(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 -x2,2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 -x3,2) + Math.pow(y1 - y3, 2), 0.5);

        //displaying the perimeter of the triangle

        System.out.println("peremiter if the triangle you just draw is: " + (side1 + side2 + side3));
    }
}
