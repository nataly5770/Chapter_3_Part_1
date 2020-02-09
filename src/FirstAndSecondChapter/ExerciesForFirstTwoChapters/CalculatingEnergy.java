package FirstAndSecondChapter.ExerciesForFirstTwoChapters;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: " );
        double mass = input.nextDouble();

        System.out.println("Enter the initial temperatures of water: " );
        double initialTemperature = input.nextDouble();


        System.out.println("Enter the final temperature of water: " );
        double finalTemperature = input.nextDouble();

        double energy = mass * (finalTemperature + initialTemperature) * 4184;

        System.out.println("The energy needed " + energy );

    }
}
