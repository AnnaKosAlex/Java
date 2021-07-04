package LevelTwo.Lesson2_1.Entity;

import LevelTwo.Lesson2_1.Lets.RunningTrack;
import LevelTwo.Lesson2_1.Lets.Wall;

public class Cat implements Entities {

    private String name;

    RunningTrack track = new RunningTrack();
    Wall wall = new Wall();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat (){}

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean doRun(int distance) {
        if (distance >= track.getDistance()) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean doJump(int height) {
        if(height >= wall.getHeight()) {
            return true;
        }else {
            return false;
        }
    }


}
