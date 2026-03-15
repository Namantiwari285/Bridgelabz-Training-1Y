package com.gla.arrays.level2;

public class FriendsInfo {

    public static void main(String[] args) {

        String[] names = {"Aman", "Akbar", "Anthony"};
        int[] age = {21, 19, 22};
        int[] height = {170, 175, 168};

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);
    }
}