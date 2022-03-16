package com.example2ndwork;

public class SumALL8form {
    public static void main(String[] args){
        double sum = 8;
        double initNum = 8;
        for (int i = 1; i <= 9; i++){
            initNum = initNum + 8*Math.pow(10,i);
            sum = initNum + sum;
        }
        System.out.println(sum);
    }
}
