package FirstAndSecondChapter.NumericTypeConvertions;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100);


        /*
        2.15.1 Can different types of numeric values be used together in a computation? YES

        2.15.2 What does an explicit casting from a double to an int do with the fractional part
        of the double value?

       When a double value is cast into an int value, the fractional part is truncated.

        The following statement
        System.out.println((double)1 / 2);
        displays 0.5, because 1 is cast to 1.0 first, then 1.0 is divided by 2. However, the statement
        System.out.println(1 / 2);
        displays 0, because 1 and 2 are both integers and the resulting value should also be an integer.



        Does casting change the variable being cast? Yes, it does

        Casting a type with a small range to a type with a larger range is known as widening a type.
        Casting a type with a large range to a type with a smaller range is known as narrowing a type.

        2.15.3 Show the following output: (Casting Exercise in the same folder but the output is f is 12.5
        i is 12);

        float f = 12.5F;
        int i = (int)f;

        System.out.println("f is " + f);
        System.out.println("i is " + i);

        2.15.4 If you change (int)(tax * 100) / 100.0 to (int)(tax * 100) / 100
        in line 11 in Listing 2.8, what will be the output for the input purchase amount of
        197.556?
        Output will be the second out below or 11$
        Sales tax is $11.85
        Sales tax is $11

        2.15.5 Show the output of the following code:

        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);

        The output of the above code is
        2.5 and 2

         */

    }
}
