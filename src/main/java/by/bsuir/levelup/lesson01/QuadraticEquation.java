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
        
        int D = b*b - 4*a*c;
        if (D < 0){
            System.out.println("No roots");
        }
        else if(D == 0){
            System.out.println(-b / 2*a);
        }
        else {
            D = (int)(Math.sqrt((double)(D)));
            System.out.println(((-b - D)/ 2*a) + " " + ((-b + D)/ 2*a));
        }
    }

}
