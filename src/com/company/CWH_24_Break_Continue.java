package com.company;

public class CWH_24_Break_Continue {
    public static void main(String[] args) {

//        break and continue using loops!
//        for(int i=0;i<5;i++){
//            System.out.println("Java is Great " + i);
//            if(i == 2){
//                System.out.println("Ending the loops");
//                break;
//            }
//        }

        //while loop
//        int i=0;
//        while(i<5){
//            System.out.println("Java is Great " + i);
//            if(i == 2){
//                System.out.println("Ending the loops");
//                break;
//            }
//            i++;
//        }

        //do - while
//        i=0;
//        do{
//            System.out.println("Java is Great " + i);
//            if(i == 2){
//                System.out.println("Ending the loops");
//                break;
//            }
//            i++;
//        }while(i<5);



        //for loop
//        for(int i=0;i<5;i++){
//            if(i == 2){
//                System.out.println("continue the loops");
//                continue;
//            }
//            System.out.println("Java is Great " + i);
//
//        }

        // while loop
        int i=0;
        while(i<5){
            if(i == 2){
                System.out.println("continue the loops");
                i++;
                continue;
            }
            System.out.println("Java is Great " + i);
            i++;
        }

        // do - while
        i=0;
        do{
            System.out.println("Java is Great " + i);
            if(i == 2){
                System.out.println("continuing the loops");
                i++;
                continue;
            }
            i++;
        }while(i<5);


        System.out.println("Loop ends here");
    }
}
