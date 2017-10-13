package com.tihor.hackerrank;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * The type Md 5.
 * https://www.hackerrank.com/challenges/java-md5/problem
 */
public class Md5 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String password = in.next();

        if (password.matches("[a-zA-Z0-9]{6,20}")) {
            System.out.println(getMD5(password));
        }
    }

    /**
     * Gets md 5.
     *
     * @param input the input
     * @return the md 5
     */
    private static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            StringBuilder hashText = new StringBuilder(number.toString(16));

            while (hashText.length() < 32) {
                hashText.insert(0, "0");
            }

            return hashText.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
