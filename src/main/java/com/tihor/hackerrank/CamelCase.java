package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/camelcase
 * The type Camel case.
 */
public class CamelCase {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] result = s.split("[A-Z]+");
        System.out.println(result.length);
    }
}
