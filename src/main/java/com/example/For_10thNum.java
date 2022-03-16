package com.example2ndwork;

public class For_10thNum {
    public static void main(String[] args){
        double sum = 0;
        double factorial = 1;
        for (double i = 1; i <= 10; i++){
            sum = sum + 1/factorial;
            factorial = factorial * i;

        }
        System.out.println(sum);
    }
}
