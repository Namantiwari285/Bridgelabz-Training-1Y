package com.gla.arrays.level2;

import java.util.Scanner;

public class LargestDigitDynamic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        int size = 10;
        int[] arr = new int[size];
        int index = 0;

        while (num != 0) {

            if (index == size) {

                size = size + size / 10;
                int[] temp = new int[size];

                for (int i = 0; i < arr.length; i++) {
                    temp[i] = arr[i];
                }

                arr = temp;
            }

            arr[index++] = num % 10;
            num = num / 10;
        }

        int largest = arr[0];
        int second = -1;

        for (int i = 1; i < index; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
    }
}