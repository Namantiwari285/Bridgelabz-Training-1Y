package com.gla.string.level1;

import java.util.Scanner;

public class SubstringProgram {

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtinSubstring = text.substring(start, end);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);

        boolean result = compareStrings(customSubstring, builtinSubstring);

        System.out.println("Are both substrings same? " + result);
    }
}