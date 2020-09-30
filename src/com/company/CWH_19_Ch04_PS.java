package com.company;
import java.util.Scanner;

public class CWH_19_Ch04_PS {

    public static void main(String[] args){

        // problem 1
//        int a = 10;
//        if(a=11){       //error: int cannot be converted to boolean
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

        /*
            problem:2
            what a problem to find out weather a student is pass
            of fail; if it requires total 40% and at least 40%
            and at least 33% in each subject to pass assume 3 subject
            and take marks as an input from user.

        */

//        byte m1,m2,m3;
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println("Your overall percentage is:" + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//
//            System.out.println("congratulation, you have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You haven't been promoted! please try again");
//        }

        /*
        problem 3:
        calculated income for paid by an employe to the government
        as per the slabs mentioned below:

        income  slab        Tax
         2.5L - 5.0L        5%
         5.0L - 10.0L       20%
         above- 10.0L       30%

        Note that there is no tax below 2.5L take input
        amount as an input from the user
         */

//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lac");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        if(income>2.5 && income<=5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax = tax + 0.0f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        }
//        else if(income>10.f){
//            tax = tax + 0.05f * (10.0f - 5.0f);
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("Total tax paid by the employee is: "+tax);

        /*
        problem 4:
         */

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        /*
        problem 5
        */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Year");
//        int year = sc.nextInt();
//
//        if(year % 400 == 0){
//            System.out.printf("%d is a leap year.",year);
//        }
//        else if(year % 100 == 0){
//            System.out.printf("%d is not a leap year.",year);
//        }
//        else if(year % 4 == 0){
//            System.out.printf("%d is a leap year.",year);
//        }
//        else {
//            System.out.printf("%d is not a leap year.",year);
//        }

//         or

//            if(year % 4 == 0 && year %100 == 0 || year % 400 == 0){
//                System.out.printf("%d is a leap year.",year);
//            }
//            else{
//                System.out.printf("%d is not a leap year.",year);
//            }

        /*
        problem 6

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String website = sc.nextLine();
        if(website.endsWith(".org")){

            System.out.println("Organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else if(website.endsWith(".com")){
            System.out.println("Commercial website");
        }
    }
}
