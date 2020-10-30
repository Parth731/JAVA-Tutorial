package com.company;

public class CWH_26_Arrays {

    public static void main(String[] args) {

        /*
        classroom of 500 student - you have to store marks of these
        500 student

        1.create 500 variable
        2. use Arrays(recommended)

        why do you use Array?
        - Access Array element very faster


        0 1 2 3 4 -> 5 element *4 byte memory =20
        this data store in heap memory location

        -you can change array index value

        there are three main way to create an array in java

        */
        //1.
        // int[] marks = new int[5]; //declaration + memory allocation

        //2.
//        int[] marks;            //declaration
//        marks = new int[5];     //memory allocation

//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
//
//        System.out.println(marks[4]);
//        marks[4] = 96;
//        System.out.println(marks[4]);
        //marks[5]; //- error throw

        //3. declaration + initialization
        int[] marks = {100,70,80,71,98};
        System.out.println(marks[3]);

    }
}
