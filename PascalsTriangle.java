package com.mycompany.pascalstriangle;

import java.util.Scanner;

public class PascalsTriangle {

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int coeff(int n, int r) {
        int c = fact(n) / (fact(r) * fact(n - r));
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(coeff(i, j) + " ");
            }
            System.out.println();
        }
    }
}
