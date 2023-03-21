package com.hillel.piatnytsia.homeworks.homework4.part2.members;

public class Cat extends Members {
    private static final String NAME = "Cat";

    public Cat(int distanceRun, int highJump) {
        super(distanceRun, highJump);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.printf("\n" + NAME + " can run");
    }

    @Override
    public void jump() {
        System.out.printf("\n" + NAME + " can jump");
    }
}
