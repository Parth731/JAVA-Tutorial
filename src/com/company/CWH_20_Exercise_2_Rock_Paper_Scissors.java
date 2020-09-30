package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_20_Exercise_2_Rock_Paper_Scissors {

    final static int ROCK = 1, SCISSORS = 2, PAPER = 3;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("please integer input");
        System.out.println("Player: Choose 1 for Rock, 2 for Scissors, or 3 for Paper:");
        int hum_player = sc.nextInt();
        System.out.println("Computer: Choose 1 for Rock, 2 for Scissors, or 3 for Paper:");
        int comp_player = ran.nextInt(3)+1;
        System.out.println(comp_player);

        if (hum_player == comp_player)
        {
            System.out.print("It is a tie");
        }
        else {
            switch (hum_player) {
                case ROCK:
                    if (comp_player == SCISSORS)
                        System.out.print("Player  wins!");
                    else if (comp_player == PAPER)
                        System.out.print("Computer  wins!");
                    break;
                case SCISSORS:
                    if (comp_player == PAPER)
                        System.out.print("Player wins!");
                    else if(comp_player == ROCK)
                        System.out.print("Computer wins!");
                    break;
                case PAPER:
                    if (comp_player == ROCK)
                        System.out.print("Player wins!");
                    else if(comp_player == SCISSORS)
                        System.out.print("Computer wins!");
                    break;
                default:
                    System.out.println("player wronged input");
            }
        }
    }
}
