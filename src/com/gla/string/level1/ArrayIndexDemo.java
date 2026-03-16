package com.gla.string.level1;

public class ArrayIndexDemo {

    public static void generateException() {

        String[] names = {"Rahul", "Aman", "Riya"};

        System.out.println(names[5]);
    }

    public static void handleException() {

        try {

            String[] names = {"Rahul", "Aman", "Riya"};

            System.out.println(names[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        try {

            generateException();

        } catch (Exception e) {

            handleException();
        }
    }
}