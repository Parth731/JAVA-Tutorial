package com.company;
import java.util.Scanner;

public class CWH_18_Switch_Case {

    public static void main(String[] args) {




        /*
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
        */

        /*
        //        switch Case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to Join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }

//        without break run above program entire case run including
//        default
        System.out.println("Thank for using Java code");
         */

//        char var = 'r';
        String var = "Shubham";

        switch (var) {
            case "Shubham" -> System.out.println("You are going to become an Adult!");
            case "Saurabha" -> System.out.println("You are going to Join a Job!");
            case "Vini" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life");
        }


    }

}
