package com.gla.string.level1;

import java.util.Scanner;

public class LowerCaseCompare {

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String lower = text.toLowerCase();

        System.out.println("Lowercase text: " + lower);

        boolean result = compareStrings(lower, text.toLowerCase());

        System.out.println("Comparison result: " + result);
    }
}