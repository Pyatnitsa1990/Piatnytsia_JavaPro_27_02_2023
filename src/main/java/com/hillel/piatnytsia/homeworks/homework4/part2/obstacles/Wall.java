package com.hillel.piatnytsia.homeworks.homework4.part2.obstacles;

import com.hillel.piatnytsia.homeworks.homework4.part2.members.Members;

public class Wall implements Obstacles{
    private static String WALL = "wall";
    private int highWall;

    public Wall(int highWall) {
        this.highWall = highWall;
    }

    @Override
    public boolean overcome(Members members) {
        boolean isOverсome = highWall <= members.getHighJump();
        members.jump();
        if(isOverсome){
            System.out.printf("\n%s overcomes this %s by jumping up to a height of %dm", members.getName(), WALL, highWall);
        }
        else{
            System.out.printf("\n%s doesn`t overcomes this %s by jumping up to a height of %dm\"", members.getName(), WALL, highWall);
        }

        return isOverсome;
    }
}
