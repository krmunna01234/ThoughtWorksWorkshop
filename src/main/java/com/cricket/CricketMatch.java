package com.cricket;

import com.cricket.model.Batsman;
import com.cricket.model.Bowler;
import com.cricket.model.Over;

import java.util.Scanner;

public class CricketMatch {

    public static final int MAX_BALL_PER_OVER = 6;

    public static void main(String[] args) {

        Batsman batsman = new Batsman();
        Bowler bowler = new Bowler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target run : ");
        int target  = scanner.nextInt();

        System.out.println("Enter the Over : ");
        Over over = new Over(scanner.nextInt());

        System.out.println("Enter the batsman type : ");
        batsman.setType(scanner.nextInt());

        int[] balls = new int[MAX_BALL_PER_OVER * over.getOver()];

        new Match().playMatch(balls, batsman, bowler, target);

    }
}
