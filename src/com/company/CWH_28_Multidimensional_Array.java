package com.company;

public class CWH_28_Multidimensional_Array {

    public static void main(String[] args) {

        //int[] marks = new int[5]; //A 1-D Array
        int[][] flats = new int[2][3]; //A 2-D Array
        // 2 is row and 5 is column
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println(flats[1][0]);

        System.out.println("Printing a 2-D array using for loop");
        for (int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //3-D Array
        //String[][][] arr = new String[][][];



    }

}
