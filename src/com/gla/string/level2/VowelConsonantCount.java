package com.gla.string.level2;

import java.util.Scanner;

public class VowelConsonantCount {

    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;

        return false;
    }

    public static int[] count(String text) {

        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {

                if (isVowel(ch))
                    v++;
                else
                    c++;
            }
        }

        int arr[] = {v, c};

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int result[] = count(text);

        System.out.println("Vowels = " + result[0]);
        System.out.println("Consonants = " + result[1]);
    }
}