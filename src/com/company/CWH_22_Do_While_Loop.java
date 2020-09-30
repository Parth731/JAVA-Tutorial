package com.company;
import java.util.Scanner;


public class CWH_22_Do_While_Loop {
    public static void main(String[] args) {

//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }

        int b = 10;
        do{
            System.out.println(b);
            b++;
        }while(b<5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int number");
        int no = sc.nextInt();

        int x=0;
        do{
            System.out.println(x);
            x++;
        }while (x<=no);



    }
}
