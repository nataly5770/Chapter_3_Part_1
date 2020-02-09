package FirstAndSecondChapter.ExerciesForFirstTwoChapters;

import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");

        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        //input.close();

        double minLength = lengthTraveled(speed, acceleration);
        System.out.println("The minimum runaway length for this airplane is " + minLength);

    }

    private static  double lengthTraveled(double speed, double acceleration) {
        double length = (speed * speed) / (2 * acceleration);
        return length;
    }
}
