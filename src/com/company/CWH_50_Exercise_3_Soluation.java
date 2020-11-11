/*
create a class game, which allows user to play "Guess the number"
game once, some should have the following methods

1. constructor to generator the random number
2. takeUserInput() to take a User input of number
3. isCorrectNumber() to delete whether the number entered by the user is true
4. getter and setter for noofguesses
use properties such as noofguesses() etc to get this task done!

 */

package com.company;
import java.util.Random;
import java.util.Scanner;

class Game1{

    private int noofguess;
    private int compno;
    private int userno;
    public Game1() {

        Random rad = new Random();
        this.compno = rad.nextInt(100)+1;
    }

    public void  TakeUserInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guess the no between 0 to 100");
        userno = sc.nextInt();
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

public class CWH_50_Exercise_3_Soluation {

    public static void main(String[] args) {

        Game1 game = new Game1();
        int no = game.isCorrectNumber();
        System.out.println("You won the game no of guess: " +no);
    }
}
