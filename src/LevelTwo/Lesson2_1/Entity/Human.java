package LevelTwo.Lesson2_1.Entity;

import LevelTwo.Lesson2_1.Lets.RunningTrack;
import LevelTwo.Lesson2_1.Lets.Wall;

public class Human implements Entities {

    private String name;
    int distance;
    int height;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human() {
    }

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean doRun(int trackDistance) {

        return distance >= trackDistance;
    }

    @Override
    public boolean doJump(int wallHeight) {

        return height >= wallHeight;
    }

}
