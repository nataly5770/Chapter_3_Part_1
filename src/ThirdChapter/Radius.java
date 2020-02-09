package ThirdChapter;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {

        int radius;
        double pi = 3.14, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        radius = input.nextInt();
        area = pi * radius * radius;

        System.out.println("Area of circle: " + area);


    }
}
