package com.gla.arrays.level2;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] height = new double[10];
        double[] weight = new double[10];
        double[] bmi = new double[10];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight  Weight  BMI  Status");

        for (int i = 0; i < 10; i++) {
            System.out.println(height[i] + "  " + weight[i] + "  " + bmi[i] + "  " + status[i]);
        }
    }
}