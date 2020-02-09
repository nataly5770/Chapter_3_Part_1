package ThirdChapter;

import java.util.Scanner;

public class WindChillTemperature_3_20 {
    public static void main(String[] args) {
        /*
        (Science: wind-chill temperature)

        Programming Exercise 2.17 gives a formula to compute the wind-chill temperature.

        The formula is valid for temperatures in the range between -58°F and 41°F
        and wind speed greater than or equal to 2.

        Write a program that prompts the user to enter a temperature and a wind speed.

        The program displays the wind-chill temperature if the input is valid; otherwise,
        it displays a message indicating whether the temperature and/or wind speed is invalid.
         */

        //prompt the user to enter a temperature between -58°F and 41°F and a wind speed greater than or equal to 2
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        System.out.println(" Please enter a wind speed greater than or equal to 2 per hour:");
        double windSpeed = input.nextDouble();


        if (temperature <= -58 || temperature >= 41 || windSpeed < 2) {

            System.out.print("The ");
            if (temperature <= -58 || temperature >= 41)
                System.out.print("temperature ");
            if ((temperature <= -58 || temperature >= 41) && windSpeed < 2)
                System.out.print("and ");
            if (windSpeed < 2)
                System.out.print("wind speed ");
            System.out.print("is invalid");
            System.exit(1);

        }
        //calculate the wind chill index
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);


        //displaying the result
        System.out.println("The wild chill index is " + windChill);
    }
}
