package com.example2ndwork;

public class DoWhile_10thNum {
    public static void main(String[] args){
        double sum = 0;
        double factorial = 1;
        double temp = 0;
        do{
            sum = sum + 1/factorial;
            temp++;
            factorial = factorial * temp;

        }while(temp <= 10);
        System.out.println(sum);
    }
}
