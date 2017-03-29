package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase
 * The type Staircase.
 */
public class Staircase {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
