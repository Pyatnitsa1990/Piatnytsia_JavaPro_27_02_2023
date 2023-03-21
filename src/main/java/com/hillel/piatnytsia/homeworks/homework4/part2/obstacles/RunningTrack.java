package com.hillel.piatnytsia.homeworks.homework4.part2.obstacles;

import com.hillel.piatnytsia.homeworks.homework4.part2.members.Members;

public class RunningTrack implements Obstacles {
    private static String RUNNING_TRACK = "track";
    int distanceTrack;

    public RunningTrack(int distanceTrack) {
        this.distanceTrack = distanceTrack;
    }

    @Override
    public boolean overcome(Members members) {
        boolean isOverсome = distanceTrack <= members.getDistanceRun();
        members.run();
        if (isOverсome) {
            System.out.printf("\n%s runs this %s overcoming a distance %dm", members.getName(), RUNNING_TRACK, distanceTrack);
        } else {
            System.out.printf("\n%s doesn`t runs this %s having overcome only a distance %dm", members.getName(), RUNNING_TRACK, distanceTrack);
        }

        return isOverсome;
    }
}
