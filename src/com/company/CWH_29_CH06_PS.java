package com.company;
import java.util. *;

public class CWH_29_CH06_PS {

    public static void main(String[] args) {

        /*
        problem 1:
        create an array of 5 float and calculate their sum
        */

        /*
        float[] marks = {45.7f,67.5f,63.4f,99.2f,100.0f};
        float sum = 0;
        for(float x:marks){
            sum += x;
        }
        System.out.println("The value of sum is => "+sum);
        */

        /*
        problem 2:
        write a program to find out weather a given integer is
        printed in an array or not
        */

        /*
        int[] marks = {45,67,63,99,100};
        int num = 46;
        boolean isArray = false;
        for(int x:marks){
            if(num == x){
                isArray = true;
                break;
            }
        }
        if(isArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");

        }
        */

        /*
        problem 3:
        calculated the average marks from an array containing of
        all students in physics using for each loop
        */

        /*
        float[] marks = {45.7f,67.5f,63.4f,99.2f,100.0f};
        float sum = 0;
        for(float x:marks){
            sum += x;
        }
        System.out.println("The value of average marks is => "+
                sum/marks.length);

         */

         /*
         problem 4:
         create java program to add two matrix of size 2*3
          */

        /*
        int[][] mat1= {
                {1,2,3},
                {4,5,6}
        };

        int[][] mat2= {
                {2,6,13},
                {3,7,1}
        };

        int[][] result={
            {0,0,0},
            {0,0,0}
        };

        for(int x=0;x<mat1.length;x++){
            for (int y=0;y<mat1[x].length;y++){
                System.out.printf("setting value for x=%d and y=%d\n",x,y);
                result[x][y] = mat1[x][y] + mat2[x][y];
            }
            System.out.println("\n");
        }

        // printing the element of 2-D Array
        for(int x=0;x<mat1.length;x++){
            for (int y=0;y<mat1[x].length;y++){
                System.out.print(result[x][y] + " ");
                result[x][y] = mat1[x][y] + mat2[x][y];
            }
            System.out.println(""); //printing a new line
        }
         */

        /*
        problem 5:
        write a java program to reverse an array
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("howmany length of array do you want?\n");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the int element");
        for(int x=0;x<num;x++){
            arr[x] = sc.nextInt();
        }

        for(int x: arr){
            System.out.println(x);
        }


        System.out.println("reverse of array");
        for(int x=0,y= arr.length-1;x<y;x++,y--){

            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;

        }
        for(int x: arr){
            System.out.printf("%d ",x);
        }



        /*
        problem 6:
        write a program to find the maximum element in java array
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("howmany length of array do you want?\n");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the int element");
        for (int x = 0; x < num; x++) {
            arr[x] = sc.nextInt();
        }

        for (int x : arr) {
            System.out.printf("%d ",x);
        }

        int max = Integer.MIN_VALUE;

        for (int x : arr){

            if (x > max) {
                max = x;
            }
        }


        System.out.println("\nMaximum num is => "+ max);

         */

        /*
        problem 7:
        rite a program to find the minimum element in java array
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("howmany length of array do you want?\n");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the int element");
        for (int x = 0; x < num; x++) {
            arr[x] = sc.nextInt();
        }

        for (int x : arr) {
            System.out.printf("%d ",x);
        }

        int min = Integer.MAX_VALUE;

        for (int x : arr){

            if (x < min) {
                min = x;
            }
        }


        System.out.println("\nminimum num is => "+ min);
        */

        /*
        problem 8:
        write a java program to find whether an array is sort or not
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("howmany length of array do you want?\n");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the int element");
        for (int x = 0; x < num; x++) {
            arr[x] = sc.nextInt();
        }

        for (int x : arr) {
            System.out.printf("%d ",x);
        }
        boolean isSorted = true;
        for(int x=0;x< arr.length-1;x++){
            
            if(arr[x]>arr[x+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("\nThe array is sorted");
        }
        else{
            System.out.println("\nThe array is not sorted");
        }


        //array sorted logic
       Arrays.sort(arr);

        for (int x : arr) {
            System.out.printf("%d ", x);
        }
        */


















    }

}
