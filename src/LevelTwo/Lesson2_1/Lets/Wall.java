package LevelTwo.Lesson2_1.Lets;

import LevelTwo.Lesson2_1.Entity.Entities;
import LevelTwo.Lesson2_1.Lets.Lets;

public class Wall implements Lets {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Wall() {

    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Entities entities) {
        return entities.doJump(3);
    }
}
