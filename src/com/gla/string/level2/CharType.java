package com.gla.string.level2;

import java.util.Scanner;

public class CharType {

    public static String check(char c) {

        if (!Character.isLetter(c))
            return "Not Letter";

        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return "Vowel";
        else
            return "Consonant";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = check(ch);

        System.out.println("Character Type = " + result);
    }
}