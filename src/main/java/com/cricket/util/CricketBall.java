package com.cricket.util;

public class CricketBall {
    public static int getBall(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
