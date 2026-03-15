package com.gla.arrays.level1;
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){

                if(arr[i] % 2 == 0){
                    System.out.println(arr[i] + " is positive and even");
                }else{
                    System.out.println(arr[i] + " is positive and odd");
                }

            }
            else if(arr[i] < 0){
                System.out.println(arr[i] + " is negative");
            }
            else{
                System.out.println("Number is zero");
            }

        }

        int first = arr[0];
        int last = arr[arr.length - 1];

        if(first == last){
            System.out.println("First and last numbers are equal");
        }
        else if(first > last){
            System.out.println("First number is greater");
        }
        else{
            System.out.println("Last number is greater");
        }

    }
}