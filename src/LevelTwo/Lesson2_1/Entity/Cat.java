package LevelTwo.Lesson2_1.Entity;

import LevelTwo.Lesson2_1.Lets.RunningTrack;
import LevelTwo.Lesson2_1.Lets.Wall;

public class Cat implements Entities {

    private String name;
    private int distance;
    private int height;

    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    public Cat (){}

    public Cat(String name) {
        this.name = name;
    }

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

    @Override
    public boolean doRun(int trackDistance) {
        return distance >= trackDistance;
    }

    @Override
    public boolean doJump(int wallHeight) {
        return height >= wallHeight;
    }


}
