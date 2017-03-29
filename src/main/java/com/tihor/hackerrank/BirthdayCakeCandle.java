package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 * The type Birthday cake candle.
 */
public class BirthdayCakeCandle {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int count = 1;
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (max < height[height_i]) {
                max = height[height_i];
            } else if (max == height[height_i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
