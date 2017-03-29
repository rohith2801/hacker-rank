package com.tihor.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum
 * The type Min max sum.
 */
public class MinMaxSum {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] array = new long[5];
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextLong();
        }

        Arrays.sort(array);

        long min = 0, max = 0;
        for (int i = 0; i < 5; i++) {
            if (i != 0) {
                max += array[i];
            }
            if (i != 4) {
                min += array[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
