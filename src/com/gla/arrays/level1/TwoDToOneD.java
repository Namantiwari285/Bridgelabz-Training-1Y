package com.gla.arrays.level1;

import java.util.Scanner;

public class TwoDToOneD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] arr2d = new int[r][c];
        int[] arr1d = new int[r * c];

        int index = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Enter value: ");
                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr1d[index] = arr2d[i][j];
                index++;
            }
        }

        System.out.println("1D array:");

        for(int i = 0; i < arr1d.length; i++){
            System.out.print(arr1d[i] + " ");
        }
    }
}