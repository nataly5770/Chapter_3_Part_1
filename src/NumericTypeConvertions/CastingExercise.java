package NumericTypeConvertions;

public class CastingExercise {
    public static void main(String[] args) {
        float f = 12.5F;
        int i = (int)f;

        double d = 4.5;
        int l = (int)d;

        int sum = 0;
        sum += 4.5; // sum becomes 4 after this statement
        sum += 4.5;

        int sum1 = 0;
        sum1 += 4.5; // sum becomes 4 after this statement
        sum1 += 4.5;  //is equivalent to sum = (int)(sum + 4.5)
        sum1 += 5;

        double amount = 5;

        //int i = 1;
        //byte b = i; this causes an error as
        // In order to assign a variable of int type to a variable of the short or byte type,
        //explicit casting must be used;

        System.out.println("f is " + f);
        System.out.println("i is " + i);
        System.out.println("l is " + l);
        System.out.println("sum is " + sum);
        System.out.println("sum1 is " + sum1);
        System.out.println(amount / 2);
        System.out.println(5 / 2);

    }
}
