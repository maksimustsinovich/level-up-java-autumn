package by.bsuir.levelup.lesson01part2;

import java.util.Scanner;

/*
 * Check the validity of triangle (a, b, c)
 * If triangle exists - print their area
 * Else - print "Invalid triangle"
 *
 * ALARAM! Area - INTEGER
 */
public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        /*
        Implement your logic here
         */
        int halfPerimeter = (a+b+c)/2;
        double area = 0;
        if(a<b+c && b<a+c&& c<a+b)
        {
            area = Math.sqrt(halfPerimeter*(halfPerimeter - a)*(halfPerimeter - b)*(halfPerimeter-c));
            System.out.println("Area: " + (int)area);
        }
        else
            System.out.println("Invalid triangle");
    }

}
