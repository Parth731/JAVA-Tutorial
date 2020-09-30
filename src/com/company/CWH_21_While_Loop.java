package com.company;

public class CWH_21_While_Loop {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("using loops:");
        int i=1;
        while (i<=3){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("finish Running while loop");

//        while (true){   // while(1) can not write int provided boolean
//            System.out.println("I am an infinite while loop!");
//        }

//        Quiz:  write a program to print natural numbers from 100 to 200

          i = 100;
          while (i<=200){
              System.out.println(i);
              i++;
          }



    }
}
