package LevelTwo.Lesson2_1.Lets;

import LevelTwo.Lesson2_1.Entity.Entities;


public class RunningTrack implements Lets {

    private int distance = 300;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public RunningTrack() {
    }

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome (Entities entities) {
        return entities.doRun(500);
    }
}
