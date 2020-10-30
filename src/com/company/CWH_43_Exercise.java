/*
create a class game, which allow
 */

package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{

    private int noofguess;
    private int compno;
    private int userno;
    public Game() {

        Random rad = new Random();
        this.compno = rad.nextInt(100)+1;
//        System.out.println("Computer guess the number: "+compno);


    }

    public void  TakeUserInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guess the no between 0 to 100");
        userno = sc.nextInt();
//        System.out.println("User Guess the number: " + userno);




    }

    public int getNoofguess() {
        return noofguess;
    }

    public void setNoofguess(int noofguess) {
        this.noofguess = noofguess;
    }


    public int isCorrectNumber(){

        do{
                TakeUserInput();
//                System.out.println(userno);
//                System.out.println(compno);
                if(userno < compno){
                    System.out.println("You selected number less\n");
                    noofguess++;
                }
                else if(userno > compno){
                    System.out.println("You selected number greater\n");
                    noofguess++;
                }
                else if(userno == compno){
                    System.out.println("You won the match...!!\n");
                    noofguess++;
                }

        }while(userno != compno);

        return noofguess;

    }
}

public class CWH_43_Exercise {

    public static void main(String[] args) {

        Game game = new Game();
        int no = game.isCorrectNumber();
        System.out.println("You won the game no of guess: " +no);




    }


}
