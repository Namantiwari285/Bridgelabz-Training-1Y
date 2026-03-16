package com.gla.string.level2;

import java.util.Scanner;

public class WordLengthArray {

    public static String[][] getWords(String text) {

        String words[] = text.split(" ");

        String arr[][] = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(words[i].length());
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String data[][] = getWords(text);

        System.out.println("Word\tLength");

        for (int i = 0; i < data.length; i++) {

            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}