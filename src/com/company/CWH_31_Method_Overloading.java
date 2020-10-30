package com.company;

public class CWH_31_Method_Overloading {

    //void return type
    static void talljock(){
        System.out.println("I invented a new word\n"+ "Plangiarisum");
    }

    static void change(int a){
        a=90;
    }

    static void change2(int[] arr){

        arr[0] = 98;
    }

    static void foo(){
        System.out.println("good morning bro...");
    }

    // a is called as parameter
     static void foo(int a){

         System.out.println("Good morning " + a + " Bro!" );
    }

    static void foo(int a,int b){

        System.out.println("Good morning " + a + " Bro!" );
        System.out.println("Good morning " + b + " Bro!" );
    }

    /*
    // error
    static int foo(int a,int b){

        System.out.println("Good morning " + a + " Bro!" );
        System.out.println("Good morning " + b + " Bro!");
        return 3;
    }
     */




    public static void main(String[] args) {

        //talljock();


        //case 1: changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after runuing change is: "+ x);

        //case 2: changing the Array
        /*
        marks ak object hai jab bhai koi function me array pass karata hai
        acually ye array reference pass karate hai and function defination
        me array ki refreance copy ho jayegi so funcation me array value
        change kar sakate ho.
         */
        //int[] marks = {12,543,7,89,98,94};
        //change2(marks);
        //System.out.println("The value of x after runuing change is: "+ marks[0]);

        //method overloading
        // same name and different argument is called method overloading
        foo();
        foo(3000);      //3000 value pass is called aragument
        foo(3000,4000);

        //int a = foo(400,500);
        //System.out.println(a);    //error


    }




}
