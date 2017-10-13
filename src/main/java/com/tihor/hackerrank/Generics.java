package com.tihor.hackerrank;

/**
 * The type Generics.
 * https://www.hackerrank.com/challenges/java-generics/problem
 */
class Generics
{
    /**
     * Print array.
     *
     * @param <E>   the type parameter
     * @param array the array
     */
    public <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Generics generics = new Generics();
        generics.printArray(new Integer[]{1, 2});
        generics.printArray(new String[]{"s1", "s2"});
    }
}
