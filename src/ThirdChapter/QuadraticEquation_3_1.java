package ThirdChapter;

import java.util.Scanner;

public class QuadraticEquation_3_1 {
    public static void main(String[] args) {

        /*

        Write a program that prompts the user to enter values for a, b, and c and displays
        the result based on the discriminant. If the discriminant is positive, display two
        roots. If the discriminant is 0, display one root. Otherwise, display “The equation
        has no real roots.”


        quadratic equations - квадратное уравнение;
        ax2 + bx + c = 0   a ≠ 0
        Because if a will be equal to 0 then it will no longer be quadratic equation but linear equation

        discriminant - дискриминант;
        To find discriminant one should do the following
        d = b2 - 4ac

        If the discriminant is positive, the equation has two real roots.
        If it is zero, then quotation has one root.
        And if it is negative, the equation has no real roots.

        Task 3.1


        */


        Scanner s = new Scanner(System.in);
        System.out.println("Enter a, b, c:");

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double discriminant = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);

        if (discriminant > 0) {

            double ans_1 = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
            double ans_2 = ((b * (-1)) - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);

            System.out.printf("The equation has two roots %.5f and %.5f and %5.f", ans_1, ans_2);

        } else if (discriminant == 0) {
            double ans = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
            System.out.println("The equation has one root " + ans);
        } else {
            System.out.println("The eauation has no real roots");

        }


    }
}


