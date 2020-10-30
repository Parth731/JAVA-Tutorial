package com.company;

public class CWH_27_ForEach_Loop {

    public static void main(String[] args) {

        //int[] marks = {98, 45, 79, 99, 80};
        //float[] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        //System.out.println(marks.length);
        //System.out.println(marks[2]);
        //String[] student = {"Harry","Parth","Rohan","Shubam"};
        //System.out.println(student.length);


        int[] marks = {98, 45, 79, 99, 80};
        //System.out.println(marks.length);

        //displaying the Array (Naive Way)
        System.out.println("printing array using navie method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        //displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);   //array traverse
        }

        //Quck Quiz: displaying the Array in reverse order (for loop)
        System.out.println("printing using for loop in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //Quck Quiz: displaying the Array in reverse order (for loop)
        System.out.println("printing using for Each loop");
        for(int element: marks){
            System.out.println(element);
        }





    }

}
