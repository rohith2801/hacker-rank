package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * @TODO this is incomplete. Taking a break from this PS.
 * https://www.hackerrank.com/challenges/counter-game
 * The type Counter game.
 */
public class CounterGame {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCaseCount = in.nextInt();
        int[] input = new int[testCaseCount];
        for (int i = 0; i < testCaseCount; i++) {
            input[i] = in.nextInt();
        }

        for (int i = 0; i < testCaseCount; i++) {
            int eachInput = input[i];
            int powerOf2 = 2;
            boolean isLouiseTurn = true;
            while (true) {
                while (true) {
                    if (powerOf2 > eachInput) {
                        isLouiseTurn = !isLouiseTurn;
                        eachInput -= powerOf2 / 2;
                        break;
                    } else if (powerOf2 < eachInput) {
                        isLouiseTurn = !isLouiseTurn;
                        eachInput /= 2;
                        break;
                    }else {
                        powerOf2 *= 2;
                    }
                }

                if (eachInput == 1) {
                    if (isLouiseTurn) {
                        System.out.println("Richard");
                    } else {
                        System.out.println("Louise");
                    }
                    break;
                }
            }
        }
    }
}
