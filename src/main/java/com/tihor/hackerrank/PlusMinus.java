package com.tihor.hackerrank;


import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus
 * The type Plus minus.
 */
public class PlusMinus {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int negative = 0, positive = 0, zero = 0;
        int arr[] = new int[n];
        for (int arr_i=0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] < 0) {
                negative++;
            } else if (arr[arr_i] > 0) {
                positive++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f\n", (float) positive/n);
        System.out.printf("%.6f\n", (float) negative/n);
        System.out.printf("%.6f\n", (float) zero/n);
    }
}
