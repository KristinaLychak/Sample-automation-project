package net.absoft.QE;

import java.util.Scanner;

public class quadraticEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();

        double x1, x2, D;

        D = Math.pow(b,2) - 4 * a * c;

        if (D > 0) {
            x1 = ((-b + Math.sqrt(D)) / (2 * a));
            x2 = ((-b - Math.sqrt(D)) / (2 * a));

            System.out.println("x1: " + x1 + " and " + "x2: " + x2);
        }

        else if (D == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("x1 = x2: " + x1);
        }

        else {
            System.out.println("null");
        }
    }
}