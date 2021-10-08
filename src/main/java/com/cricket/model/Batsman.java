package com.cricket.model;

import java.util.Random;

public class Batsman {

    private int totalRun = 0;
    private static final int MIN_RUN = 0;
    private static final int MAX_RUN = 6;

    private static final int[] hitterRun = {4, 6};
    private static final int[] defensiveRun = {0,1,2,3};

    private boolean isOut = false;

    private int type;

    private int run;

    public int getTotalRun() {
        return totalRun;
    }

    public void  setBatsmanOut(int ball){
        this.isOut =  this.run == ball;
    }

    public boolean isOut() {
        return isOut;
    }

    public void hitRun(){
        if (this.type == 0) {
            this.run = hitterRun[new Random().nextInt(hitterRun.length)];
        }
        else if(this.type == 1) {
            this.run = (int) ((Math.random() * (MAX_RUN - MIN_RUN)) + MIN_RUN);
        }
        else if(this.type == 2){
            this.run = defensiveRun[new Random().nextInt(defensiveRun.length)];
        }
        this.totalRun = this.totalRun + this.run;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRun() {
        return run;
    }

}
