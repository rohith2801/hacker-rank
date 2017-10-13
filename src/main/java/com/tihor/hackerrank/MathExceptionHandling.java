package com.tihor.hackerrank;

/**
 * The type Math exception handling.
 * https://www.hackerrank.com/challenges/java-exception-handling/problem
 */
public class MathExceptionHandling {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) throws Exception {
        MathExceptionHandling e = new MathExceptionHandling();
        e.power(2, 3);
    }

    /**
     * Power long.
     *
     * @param n the n
     * @param p the p
     * @return the long
     * @throws Exception the exception
     */
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }
}
