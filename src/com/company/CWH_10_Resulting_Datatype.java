package com.company;

public class CWH_10_Resulting_Datatype {

    public static void main(String[] args) {

//        byte x =5;
//        int y=6;
//        short z = 8;
//        int a = y + z;
//        float b = 6.54f + x;
//        System.out.println(b);

//        increment and Decrement Operator
        int i= 56;
        // int b = i++; // first  b is assigned i then i is increment(56)
        int j = 67;
        // int c = ++j; // first  j is increment then c is assigned j(68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // Quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);//64

        char a = 'B';
        a++;
        System.out.println(a);


    }

}
