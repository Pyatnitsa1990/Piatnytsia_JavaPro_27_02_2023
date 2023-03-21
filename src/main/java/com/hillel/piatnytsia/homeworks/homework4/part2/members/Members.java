package com.hillel.piatnytsia.homeworks.homework4.part2.members;

public abstract class Members {

    private int distanceRun;
    private int highJump;

    public Members(int distanceRun, int highJump) {
        this.distanceRun = distanceRun;
        this.highJump = highJump;
    }

    public abstract String getName();

    public abstract void run();

    public abstract void jump();

    public int getDistanceRun() {
        return distanceRun;
    }

    public int getHighJump() {
        return highJump;
    }
}

