package com.company;
import java.util.Scanner;

public class CWH_13_Strings {

    public static void main(String[] args) {

//        String-> class

        // String name = new String("Parth");
        String name = "Parth";
        System.out.print("This name is : ");
        System.out.print(name);

        // println is print the string with space
        // println print karake piche space jodadega
        // System.out.println(name);
        System.out.println();
        int a= 6;
        float b = 5.6454f;

//      // format specifier
        System.out.printf("The value of a is %d and value of b %8.2f\n",a,b);
        System.out.format("The value of a is %d and value of b %f\n",a,b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings...");
//        String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);


    }

}
