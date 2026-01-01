/**
 *  Java program to use logical && and bitwise & operators.
 */

package com.myoperators;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        System.out.println(true && true); // Output: true

        System.out.println(true && false); // Output: false

        System.out.println(false && true); // Output: false

        System.out.println(false && false); // Output: false

        System.out.println(true & false); // Output: false

        System.out.println(true & true); // Output: true

        System.out.println(false & true); // Output: false

        System.out.println(false & false); // Output: false

    }
}