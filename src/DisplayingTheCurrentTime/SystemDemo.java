package DisplayingTheCurrentTime;

public class SystemDemo {
    public static void main(String[] args) {


        /*
        The java.lang.System.currentTimeMillis() method returns the current time in milliseconds.
        The unit of time of the return value is a millisecond,
        the granularity of the value depends on the underlying operating system and may be larger.
       */


        //returns the current time in milliseconds
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());


    }
}
