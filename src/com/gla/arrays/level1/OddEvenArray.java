package com.gla.arrays.level1;

import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] odd = new int[number];
        int[] even = new int[number];

        int o = 0;
        int e = 0;

        for(int i = 1; i <= number; i++){

            if(i % 2 == 0){
                even[e] = i;
                e++;
            }else{
                odd[o] = i;
                o++;
            }

        }

        System.out.println("Odd numbers:");
        for(int i = 0; i < o; i++){
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for(int i = 0; i < e; i++){
            System.out.print(even[i] + " ");
        }
    }
}