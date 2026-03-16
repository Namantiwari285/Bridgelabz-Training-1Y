package com.gla.string.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {

        int start = 5;
        int end = 2;

        String sub = text.substring(start, end);
        System.out.println(sub);
    }

    public static void handleException(String text) {

        try {

            int start = 5;
            int end = 2;

            String sub = text.substring(start, end);
            System.out.println(sub);

        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        try {

            generateException(text);

        } catch (Exception e) {

            handleException(text);
        }
    }
}