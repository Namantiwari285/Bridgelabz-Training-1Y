package com.gla.string.level2;

import java.util.Scanner;

public class SplitWords {

    public static String[] mySplit(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String arr[] = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {

                arr[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }

        arr[index] = text.substring(start);

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String a[] = mySplit(text);
        String b[] = text.split(" ");

        System.out.println("Words using my method:");

        for (String s : a) {
            System.out.println(s);
        }

        System.out.println("Words using split():");

        for (String s : b) {
            System.out.println(s);
        }
    }
}