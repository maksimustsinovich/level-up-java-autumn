package by.bsuir.levelup.lesson01part2;

import java.util.Scanner;

/**
 * Input - "Hi", "Bye", "How are you"
 * If "Hi" - print "Hello"
 * If "Bye" - print "Good bye"
 * If "How are you" - print "How are your doing"
 * Else - print "Wtf?"
 */
public class Greeting {

    public static void main(String[] args) {
        // DON'T TOUCH

        Scanner scanner = new Scanner(System.in);

        String greeting = scanner.nextLine();

        scanner.close();

        // DON'T TOUCH

        /*
        Implement logic here.
         */
        if(greeting.equals("Hi"))
            System.out.println("Hello");
        else if (greeting.equals("Bye"))
            System.out.println("Good bye");
        else if (greeting.equals("How are you"))
            System.out.println("How are you doing");
        else
            System.out.println("Wtf?");
    }

}
