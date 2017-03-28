package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * url: https://www.hackerrank.com/challenges/diagonal-difference?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * The type Diagonal difference.
 */
public class DiagonalDifference {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int d1 = 0;
        int d2 = 0;
        int x = 0;
        int y = n - 1;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    d1 += a[a_i][a_j];
                }
                if (a_i == x && a_j == y) {
                    d2 += a[a_i][a_j];
                    x++;
                    y--;
                }
            }
        }

        System.out.println(Math.abs(d1 - d2));
    }
}
