package com.gla.arrays.level2;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        int[] digits = new int[20];
        int index = 0;

        while (num != 0) {

            digits[index++] = num % 10;
            num = num / 10;
        }

        System.out.println("Digits in reverse order:");

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}