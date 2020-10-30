/*
*
*
*
*
* */
package com.company;
import  java.util.Scanner;

public class CWH_06_Exercise_1_CBSE_Board_Percentage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float totalmarks = 0;
        System.out.println("Enter Student Marks out of 100");

        System.out.println("Enter Java Marks");
        float Java = sc.nextFloat();

        System.out.println("Enter JavaScript Marks");
        float JS = sc.nextFloat();

        System.out.println("Enter python Marks");
        float Python = sc.nextFloat();

        System.out.println("Enter php Marks");
        float Php = sc.nextFloat();

        System.out.println("Enter c++ Marks");
        float Cpp = sc.nextFloat();

        totalmarks = Java + JS + Python + Php + Cpp;

        float percentage = (totalmarks * 100) / 500;

        System.out.println("Your TotalMarks out of 500");
        System.out.println(totalmarks);
        System.out.println("Your percentage out of 500");
        System.out.println(percentage);



    }








}
