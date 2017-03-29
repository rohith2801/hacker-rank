package com.tihor.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 * The type Lonely integer.
 */
public class LonelyInteger {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> resultMap = new HashMap<>(n/2 + 1);
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (resultMap.get(a[i]) == null) {
                resultMap.put(a[i], 1);
            } else {
                resultMap.put(a[i], resultMap.get(a[i]) + 1);
            }
        }

        resultMap.forEach((Integer key, Integer value) -> {
            if (value % 2 == 1) {
                System.out.println(key);
            }
        });
    }
}
