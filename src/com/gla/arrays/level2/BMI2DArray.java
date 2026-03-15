package com.gla.arrays.level2;

import java.util.Scanner;

public class BMI2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (meter): ");
            double height = sc.nextDouble();

            if (weight < 0 || height < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nWeight Height BMI Status");

        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "  " +
                               personData[i][1] + "  " +
                               personData[i][2] + "  " +
                               weightStatus[i]);
        }
    }
}