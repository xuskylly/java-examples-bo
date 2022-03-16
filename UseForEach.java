package com.example;

public class UseForEach {
    public static void main(String[] args){
        testlen();
    }
    private static void testlen() {
        int size = 10;
        String[] stringslist = new String[size];
        stringslist[0] = "I";
        stringslist[1] = "am";
        stringslist[2] = "Skylly";
        stringslist[3] = "Hello";
        stringslist[4] = "Oops";
        stringslist[5] = "Sam";
        stringslist[6] = "is";
        stringslist[7] = "doing";
        stringslist[8] = "his";
        stringslist[9] = "homework";
        for(String i : stringslist){
            if(i.length() >= 2 && i.length() <= 4){
                System.out.println(i);
            }
        }
    }
}
