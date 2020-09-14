package com.company;
import java.util.Scanner;


public class CWH_12_Ch02_PS {

    public static void main(String[] args) {

        /*
        problem 1:
        what will be the result of the following expression

        float a = 7/4*8/2
         */

        float a = 7/4 * 9/2; //4.0
        System.out.println(a);
        a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        /*
        problem 2:

        write a java program to energy a grate by adding 8 to it
        decrypt it to show the correct grade

        */

        char grade = 'B';
        grade  = (char)(grade + 8);
        System.out.println(grade);//J

        // Decrypting the grade
        grade  = (char)(grade - 8);
        System.out.println(grade);//B

        /*
        problem 3:

        use comparison operator to find out whether a given number
        is grater than the user entered number or not

        */

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a>8);


        /*
        problem 4:

        write a program expression in a given program:

                ((v*v) - (u*u))/(2*a*s)

        */

        float v = 5;
        float u = 10;
        a = 2;
        float s = 20;
        float res = ((v*v) - (u*u))/(2*a*s);
        System.out.println(res);//-0.9375


        /*

        problem 5:

        find the value of following expression

            int x = 7;
            int a = 7 * 49 / 7 + 35 / 7;
            a = ?

        */

        int x = 7;
        a = (int)(7 * 49 / 7 + 35 / 7);
        System.out.println(a);//54.0





    }



}
