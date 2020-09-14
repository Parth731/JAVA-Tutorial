package com.company;

public class CWH_09_Associaivity {
    public static void main(String[] args) {

        // Precedence & Associativity

//        int a = 6 * 5 - 34 / 2;
        /*
        * Highest Precedence goes to * and /. They are then evaluated
        * on the basis of left to right associativity
        *
        *   = 30 - 34 / 2
        *   = 30 -17
        *   = 13
        * */
//        int b = 60 / 5 - 34 * 2;
        /*
        *  = 12-34*2
        *  = 12-68
        *  = -56
        * */
//        System.out.println(a);
//        System.out.println(b);

        // quiz 1
        int x = 6;
        int y = 4;
        int z = x - y / 2;
        System.out.println(z);

        // quiz 2
        int a = 3;
        int b = 2;
        int c = 5;
        int res = (b * b - 4 * a * c) / (2 * a);
        // 4 - 60 / 6
        System.out.println(res);

        // quiz 3
        int v = 4;
        a = 5;
        res = v*v - a;
        System.out.println(res);

        // quiz 4
        a = 8;
        b = 7;
        int d = 13;
        d = a * b - d;
        System.out.println(d);

    }

}
