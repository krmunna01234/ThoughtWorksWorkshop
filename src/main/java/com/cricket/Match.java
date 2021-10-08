package com.cricket;

import com.cricket.model.Batsman;
import com.cricket.model.Bowler;
import com.cricket.util.CricketBall;

public class Match {

    public static final int MIN_RUN = 0;
    public static final int MAX_RUN = 6;

    public void playMatch(int[] balls, Batsman batsman,
                          Bowler bowler, int target){

        int ball = 0;
        while (ball < balls.length && batsman.getTotalRun() >= target){
            batsman.hitRun();

            int numberBall = CricketBall.getBall(MIN_RUN, MAX_RUN);
            System.out.println("Number of ball : " + ball + " Batsman got : " +  batsman.getRun() + ", Baller has : " + numberBall);
            batsman.setBatsmanOut(numberBall);
            if(batsman.isOut()) {
                break;
            }
            bowler.setTotalBall(numberBall);

            ball++;
        }

        if (batsman.isOut())
        {
            System.out.println("\n Batsman is out");
        }
        if (batsman.getTotalRun() >= target)
            System.out.println("\nBatsman won the match");
        else
            System.out.println("\nBatsman lost the match");
        
    }

}
