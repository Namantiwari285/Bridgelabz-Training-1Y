package com.gla.arrays.level2;
package com.gla.arrays.level2;
import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (num != 0) {

            int d = num % 10;
            digits[index] = d;
            index++;

            num = num / 10;
        }

        int largest = digits[0];
        int second = -1;

        for (int i = 1; i < index; i++) {

            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } 
            else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
    }
}