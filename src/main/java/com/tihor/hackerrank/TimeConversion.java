package com.tihor.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion
 * The type Time conversion.
 */
public class TimeConversion {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int length = time.length();
        String result = time.substring(0, length - 2);

        if (result.substring(0, 2).equals("12")) {
            result = "00" + result.substring(2);
        }

        String median = time.substring(length - 2);
        if (median.equalsIgnoreCase("PM")) {
                int hours = Integer.parseInt(result.substring(0, 2)) + 12;
                result = hours + result.substring(2);
        }

        System.out.println(result);
    }
}
