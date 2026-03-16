package com.gla.string.level2;

import java.util.Scanner;

public class StringLength {

    public static int findLength(String s) {

        int count = 0;

        try {

            while (true) {
                s.charAt(count);
                count++;
            }

        } catch (Exception e) {

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println("Length using method = " + len1);
        System.out.println("Length using length() = " + len2);
    }
}