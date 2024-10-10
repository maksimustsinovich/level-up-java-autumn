package by.bsuir.levelup.lesson01;

/**
 * All you need to do is exchange the values of the variables :)
 * <br>
 * If you are very clever - without using a temporary variable :D
 */
public class ExchangeVariableValues {

    public static void main(String[] args) {
        int a = 1;
        int b = 100;

        System.out.println("A = " + a + ". B = " + b + "." ); // DON'T TOUCH.

        /*
        Implement the exchange of the value of variables A and B here.
         */

        a = a*b;
        b = a/b;
        a = a/b;


        System.out.println("A = " + a + ". B = " + b + "." ); // DON'T TOUCH.
    }

}
