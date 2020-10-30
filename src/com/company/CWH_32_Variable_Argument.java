package com.company;

public class CWH_32_Variable_Argument {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }

//      static int sum(int ...arr){
////         Available int[] arr:
//          int result=0;
//          for(int a: arr){
//              result += a;
//          }
//
//          return result;
//      }

    // compulsory one value(int x) pass karani pdegi
    static int sum(int x,int ...arr){
//         Available int[] arr:
        int result=0;
        for(int a: arr){
            result += a;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println("Welcome to varargs Tutorial");

        //because sum me kuch pass nai kar raha hai funcation
        // defination me empty arr hoga isliye Answer 0 ayega
        //System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 5: "
                + sum(5));
        System.out.println("The sum of 4 and 5 is: "
                + sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is: "
                + sum(4,3,5));
        System.out.println("The sum of 4, 3 and 5 is: "
                + sum(4,3,5,6));
    }

}
