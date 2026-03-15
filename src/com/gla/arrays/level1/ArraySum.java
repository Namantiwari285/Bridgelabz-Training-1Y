package com.gla.arrays.level1;

package com.gla.arrays.level1;
import java.util.Scanner;
public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0;

        int index = 0;

        while(true){

            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if(num <= 0){
                break;
            }

            arr[index] = num;
            index++;

            if(index == 10){
                break;
            }

        }

        for(int i = 0; i < index; i++){
            total = total + arr[i];
        }

        System.out.println("Total sum = " + total);

    }
}