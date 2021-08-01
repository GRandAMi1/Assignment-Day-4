package com.blz.practiceproblem;

import java.util.Random;

public class SinglePlayerSnakeLadder {
    public static Random random = new Random();
    public static int diceRoll, slnp, player,turns;

    public static void main(String[] args) {
        Loop();

    }

    public static void Dice() {
        turns = turns + 1;
        int temp = random.nextInt(6);
        diceRoll = temp + 1;
    }

    public static void SLNP() {
        int temp = random.nextInt(3);
        slnp = temp + 1;
        if (slnp == 1) {// No play
        } else if (slnp == 2) {// Snake
            Dice();
            player = player + diceRoll;
        } else {
            Dice();
            player = player - diceRoll;
            if (player < 0) {
                player = 0;
            }
        }
    }

    public static void Loop() {
        while (player < 100) {
            SLNP();
        }
        if (player == 100) {
            System.out.println("You WINS");
            System.out.println("Total dice rolled : "+ turns);
        } else {
            player = player - diceRoll;
            Loop();
        }

    }

}