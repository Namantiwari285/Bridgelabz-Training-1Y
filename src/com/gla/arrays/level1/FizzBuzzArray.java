package com.gla.arrays.level1;

public class FizzBuzzArray {

    public static void main(String[] args) {

        String[] result = new String[11];

        for(int i = 0; i <= 10; i++){

            if(i % 3 == 0 && i % 5 == 0){
                result[i] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                result[i] = "Fizz";
            }
            else if(i % 5 == 0){
                result[i] = "Buzz";
            }
            else{
                result[i] = String.valueOf(i);
            }

        }

        for(int i = 0; i < result.length; i++){
            System.out.println("Position " + i + " = " + result[i]);
        }

    }
}