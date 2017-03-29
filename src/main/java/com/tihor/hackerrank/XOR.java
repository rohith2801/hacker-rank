package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 * The type Xor.
 */
public class XOR {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = 0;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                int xor = i ^ j;
                if (xor > result) {
                    result = xor;
                }
            }
        }

        System.out.println(result);
    }
}
