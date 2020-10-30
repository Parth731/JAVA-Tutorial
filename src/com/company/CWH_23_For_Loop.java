package com.company;
import java.util.Scanner;


public class CWH_23_For_Loop {

    public static void main(String[] args) {

//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }

        //2n = Even Numbers = 0,2,4,6,8
        //2n+1 = odd Numbers = 1,3,5,7,9

//      Quiz : Write a program to print first n odd numbers using for loop
//        int n = 10;
//        for(int i=0;i<5;i++){
//            System.out.println(2*i+1);
//        }


//        decrementing for loop
        for(int i=7;i!=0;i--){
            System.out.println(i);
        }

//        Quiz Write a program to print first n natural in reverse order
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer number");
        int n = sc.nextInt();

        for(int i=n;i>0;i--){
            System.out.print(i + " ");
        }

    }
}
