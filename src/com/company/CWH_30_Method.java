package com.company;

public class CWH_30_Method {

    /*
    what is different between method and function
    -method: it is use in class function
    -function: it is not use in class function
    all most is same

    static method must be call to the static method not call to the
    non static

    remove static
    jo bhi class object banega apani apani copy hogi.
     */
    /*
    static  int logic(int a,int b){
        int z;
        if(a>b){
            z = a+b;
        }
        else{
            z = (a + b) * 5;
        }

        return z;
    }
    */

    int logic(int a,int b){
        int z;
        if(a>b){
            z = a+b;
        }
        else{
            z = (a + b) * 5;
        }

        a = 566;
        return z;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;

//        method invocation using object creation
        CWH_30_Method obj = new CWH_30_Method();
//        c = obj.logic(a,b);
//        System.out.println(c);

//        method using static creation
//        c = logic(a,b);
//        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c1);









    }



}
