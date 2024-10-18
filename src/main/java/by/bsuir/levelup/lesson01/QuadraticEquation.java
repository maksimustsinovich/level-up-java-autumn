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
        int discriminant = b*b - 4*a*c;

        if (discriminant < 0)
            System.out.println("Нет решения");

        else
        {
            root1 = (-b - Math.sqrt(discriminant)) / (2*a);
            root2 = (-b + Math.sqrt(discriminant)) / (2*a);

            if (root1 == root2)
            {
                System.out.println("x1 == x2 == " + root1);
            }
            else
            {
                System.out.println("x1 == " + root1);
                System.out.println("x2 == " + root2);
            }
    }

}
