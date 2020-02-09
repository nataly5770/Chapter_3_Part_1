package ThirdChapter;

public class Random_Point_3_16 {
    public static void main(String[] args) {

        /*
        (Random point) Write a program that displays a random coordinate in a rectangle.
         The rectangle is centred at (0, 0) with width 50 and height 150.
         */

        //first of all we would need to generate width and height

        int width = (int) (Math.random() * (50 + 50) - 50);
        int height = (int) (Math.random() * (100 + 100) - 100);

        //now we would need to display coordinate

        System.out.println("Random coordinate in rectangle centered at (0, 0)");
        System.out.println("with width 100 and height 200: (" + width + ", " + height + " )");


    }
}
