package FirstAndSecondChapter.IncrementAndDecrementOperators;

public class PrefixPostfix {
    public static void main(String[] args) {
       int i = 10;
       int newNum1 = 10 * i++;

        System.out.println("i is " + i + ", newNum is " + newNum1);

        int k = 3;
        int l = 3;

        ++k;
        --l;

        System.out.println("Let's see the result of " +
                "the increment and decrement below > " + "K becomes " + k + " and L becomes "+ l);


        int a = 10;
        int newNum2 = 10 * (++a);
        System.out.println("a is " + a + ", newNum is " + newNum2);


        double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);

        System.out.println("In this case Z equals: " + z);

        int c = 1;
        int d = ++c + c * 3;

        System.out.println("D equals: " + d);



    }
}
