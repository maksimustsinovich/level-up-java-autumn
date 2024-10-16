package by.bsuir.levelup.lesson01;

import java.util.Scanner;

import static java.lang.Math.sqrt;

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

        double d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println("x1: " + ((-b + sqrt(d)) / (2 * a)));
            System.out.print("x2: " +  ((-b - sqrt(d)) / (2 * a)));
        }

        else if(d == 0)
            System.out.printf("x: %.2f", ((double) -b / (2 * a)));

        else
            System.out.print("No roots");


    }

}
