package ThirdChapter;


import java.util.Scanner;

public class ComputeThePerimeterOfATriangle_3_19SecondVersion {
    public static void main(String[] args) {

         /*
        (Compute the perimeter of a triangle) Write a program that reads three edges for a
        triangle and computes the perimeter if the input is valid. Otherwise, display that the
        input is invalid.

        The input is valid if the sum of every pair of two edges is greater than the remaining edge.

         */

       Scanner input = new Scanner(System.in);
       // Prompting the user to insert 3 sides
        System.out.println("Insert 3 sides of the triangle");

       double side1 = input.nextDouble();
       double side2 = input.nextDouble();
       double side3 = input.nextDouble();

        System.out.println("Triangle perimeter is " + (side1 + side2 + side3));


    }
}
