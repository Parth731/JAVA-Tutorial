package com.company;
import java.util.Scanner;


public class CWH_25_ch05_PS {

    public static void main(String[] args) {


        /*
         problem 1: write a program the following pattern
         *****
         ****
         ***
         **
         *
         */


//        Scanner sc = new Scanner(System.in);

//        int n =5;
//        for(int x=n;x>=0;x--){
//            for(int y=0;y<x;y++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
        problem 2: write a program to sum first n even numbers
        using while loop
        */

//        int n = 10;
//        int sum = 0;
//        int x = 0;
//        while(x<n){
//            sum = sum + (x * 2);
//            System.out.println("x -> " + x);
//            x++;
//            System.out.println("sum -> " + sum);
//        }
//        System.out.println(sum);    //90


        /*
        problem 3: write a program to print multiplication table
        of given number n
         */

//        int n = 10;
//        for(int x=0;x<=10;x++){
//                System.out.printf("%d * %d = %d\n",n,x,n*x);
//        }


        /*
        problem 4: write a program to print multiplication table of
        10 in reverse order
         */

//        int n = 5;
//        for(int x=10;x>=0;x--){
//                System.out.printf("%d * %d = %d\n",n,x,n*x);
//        }


        /*
        problem 5: write a program to find factorial of given
        number using for loops
         */

//        int  n=5;
//        int fact = 1;
//        for(int i=1;i<=n;i++){
//            fact = fact * i;
//        }
//        System.out.println("factorial -> " + fact);

        /*
        problem 6: Repeat 5 using while loop
         */

//        int  n=4;
//        int fact = 1;
//        int x = 1;
//        while(x<=n){
//            fact = fact * x;
//            x++;
//        }
//        System.out.println("factorial -> " + fact);


        /*
        problem 7: Repeat 1 using for/while loop
         */

//        int n = 5;
//        int x = 5;
//        while (x >= 0) {
//            int y = 0;
//            while (y < x) {
//                System.out.print("*");
//                y++;
//            }
//            x--;
//            System.out.println();
//        }

        /*
        problem 8: what can be done using one type of loop can
        also be done using the other two type of loop - true and
        false
         */

//        Answer: true

        /*
        problem 9: write a program to calculated the sum of the
        number accuring in the multiplication table of 8
         */
//        int n = 8;
//        int sum = 0;
//        for(int x=0;x<=2;x++){
//            sum += n*x;
//
//        }
//        System.out.println(sum);

        /*
        problem 10: A do while loop is executed
        1> At least once
        1> At least twice
        3> At most once
         */

//        Answer: At least once


        /*
        problem 11: Repeat 2 using for loop
         */

        int n = 10;
        int sum = 0;
        for(int x=0;x<n;x++){
            sum = sum + (x * 2);
        }
        System.out.println(sum);    //90






    }

}
