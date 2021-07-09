package leveltwo.lesson2_1.model.obstacle;

import leveltwo.lesson2_1.model.competitor.Competitor;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Competitor competitor) {
        competitor.jump(height);
    }
}
