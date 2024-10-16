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

        int c = b;
        b = a;
        a = c;

        System.out.println("A = " + a + ". B = " + b + "." ); // DON'T TOUCH.
    }

}
