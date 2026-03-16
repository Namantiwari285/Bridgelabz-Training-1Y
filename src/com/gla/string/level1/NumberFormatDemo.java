

package com.gla.string.level1;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {

        int num = Integer.parseInt(text);
        System.out.println("Number is: " + num);
    }

    public static void handleException(String text) {

        try {

            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();

        try {

            generateException(text);

        } catch (Exception e) {

            handleException(text);
        }
    }
}