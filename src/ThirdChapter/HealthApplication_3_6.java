package ThirdChapter;

import java.util.Scanner;

public class HealthApplication_3_6 {
    public static void main(String[] args) {
        /*
        (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
        let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
        inches, you will enter 5 for feet and 10 for inches.

        Zen etu ja reshila sdelat prosto v KG, uzas ja ze skelet, nado est bolshe
         */

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter weight in KG's: ");
        double weight = in.nextDouble();
        System.out.printf("Enter height in centimeters using coma : ");
        double height = in.nextDouble();

        double bodyMassIndex = (weight / height) / height;

        System.out.println("BMI is " + bodyMassIndex);

        if (bodyMassIndex < 18.5)
            System.out.println("Underweight");
        else if (bodyMassIndex < 25)
            System.out.println("Normal");
        else if (bodyMassIndex < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
