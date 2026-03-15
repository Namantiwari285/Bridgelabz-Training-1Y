package com.gla.arrays.level2;

import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        int[] years = new int[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter salary of employee " + (i + 1));
            salary[i] = sc.nextDouble();

            System.out.println("Enter years of service");
            years[i] = sc.nextInt();

            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {

            double bonus;

            if (years[i] > 5) {
                bonus = salary[i] * 0.05;
            } else {
                bonus = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus;
            totalBonus += bonus;

            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        System.out.println("Total bonus paid by company: " + totalBonus);
    }
}