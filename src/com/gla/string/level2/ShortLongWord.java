package com.gla.string.level2;

import java.util.Scanner;

public class ShortLongWord {

    public static int[] findWords(String text) {

        String words[] = text.split(" ");

        int small = words[0].length();
        int big = words[0].length();

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < small) {
                small = words[i].length();
            }

            if (words[i].length() > big) {
                big = words[i].length();
            }
        }

        int arr[] = {small, big};

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        int res[] = findWords(text);

        System.out.println("Shortest length = " + res[0]);
        System.out.println("Longest length = " + res[1]);
    }
}