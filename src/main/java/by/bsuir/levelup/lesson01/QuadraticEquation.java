package by.bsuir.levelup.lesson01;

import java.util.Scanner;

/**
 * Write a program that solves simple quadratic equations. The correctness of the data is guaranteed. Roots can only be integers.
 * Possible answers:
 * <br>
 * if 2 roots: <1 root> <2 root>
 * <br>
 * if 1 root: <1 root>
 * <br>
 * if there are no roots: No roots
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        // DON'T TOUCH START.

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // first
        int b = scanner.nextInt(); // middle
        int c = scanner.nextInt(); // free

        scanner.close();

        // DON'T TOUCH END.

        /*
        Implement the algorithm for solving a quadratic equation here.
         */
                int discriminant = b2*b2 - 4*a2*c2;

        if (discriminant < 0)
            System.out.println("Нет решения");

        else
        {
            root_1 = (-b2 - Math.sqrt(discriminant)) / (2*a2);
            root_2 = (-b2 + Math.sqrt(discriminant)) / (2*a2);

            if (root_1 == root_2)
            {
                System.out.println("x1 == " + root_1);
            }
            else
            {
                System.out.println("x1 == " + root_1);
                System.out.println("x2 == " + root_2);
            }
    }

}
