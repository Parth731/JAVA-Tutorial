package com.company;
import java.util.Scanner;

public class CWH_34_ch07_PS {

    static void multiplication(int n){

        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    static void pattern1(int n){

        for(int x=0;x<=n;x++){
            for (int y=0;y<x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1_Rec(int n){


        if(n>0) {

            pattern1_Rec(n - 1);
            for (int x = 0; x < n; x++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // pattern1_Rec(3)
        // pattern1_Rec(2) + 3 times star and new line
        // pattern1_Rec(1) + 2 times star and new line + 3 times star and new line
        // pattern1_Rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    }


    static int SumRec(int n){

        //base condition
        //sum(3) = 3 + sum(2)
        //sum(3) = 3 + 2 + sum(1)
        //sum(3) = 3 + 2 + 1
        if(n==1){
            return 1;
        }
        else {
            return n + SumRec(n-1);
        }
    }


    static void pattern2(int n){

        for(int x=0;x<=n;x++){
            for (int y=0;y<n-x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2_Rec(int n){


        if(n>0) {

            for (int x = 0; x < n; x++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_Rec(n - 1);
        }
    }

    static int fibonacii(int n){

        /*
        if(n==1)
            return 0;
        else if(n==2){
            return 1;
        }
        */
        if(n==1 || n==2) {

            return n-1;
        }
        else {
            return fibonacii(n - 1) + fibonacii(n - 2);
        }


    }

    static void ArrSum(int ...arr){

        int sum = 0;
        for(int x:arr){
            sum += x;
        }

        System.out.println("sum => " + sum + " " + arr.length);
        int avg = sum/ arr.length;
        System.out.println("Average marks is: " + avg);

    }

    static int Sum(int n){
        int sum=0;

        for(int x=0;x<=n;x++)
            sum += x;

        return sum;
    }


    static void celsiustofahr() {
        float celsius;

        for (celsius = 0; celsius <= 300; celsius = celsius + 20)
            System.out.printf("%3.0f%6.1f\n", celsius, (9.0 * celsius) / 5.0 + 32);
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        /*
        problem 1:
        write a java method to print multiplication table of
        n number.
         */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        multiplication(num);
        */

        /*
        problem 2:
        write a program using function to print the
        following pattern:

        *
        **
        ***
        ****
        *****

         */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        pattern1(num);
         */

        /*
        problem 3:
        write a recursive function to calculate sum of first
        n natural numbers
        */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        int res = SumRec(num);
        System.out.println("sum => "+ res);
         */

         /*
        problem 4:
        write a program using function to print the
        following pattern:

        *****
        ****
        ***
        **
        *

         */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        pattern2(num);
         */

        /*
        problem 5:
        write a function print nth term of fibonacci
        series using recursive
         */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        int res = fibonacii(num);
        System.out.println("result => "+ res);
        */

        /*
        problem 6:
        write a function to find average of a set of numbers
        passed as argument
        */

        /*
        System.out.println("how many do you want to create array");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int x=0;x<num;x++){
            arr[x] = sc.nextInt();
        }

        ArrSum(arr);
        */

        /*
        problem 7:
        repeat Ex:4 using recursive
        */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        pattern2_Rec(num);
        */

        /*
        problem 8:
        repeat Ex:2 using recursive
         */

        /*
        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        pattern1_Rec(num);
        */

        /*

        problem 9:
        write a function to converted celsius temperature
        into fahrenheit
        */
        celsiustofahr();


        /*
        problem 10:
        repeat Ex:2 using iterative
        */

        System.out.println("Enter the integer number");
        int num = sc.nextInt();
        int res = Sum(num);
        System.out.println("sum => "+ res);
        
    }
}
