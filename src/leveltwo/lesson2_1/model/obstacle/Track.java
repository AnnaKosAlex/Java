package leveltwo.lesson2_1.model.obstacle;

import leveltwo.lesson2_1.model.competitor.Competitor;


public class Track implements Obstacle {
    private final int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Competitor competitor) {
        competitor.run(distance);
    }
}
