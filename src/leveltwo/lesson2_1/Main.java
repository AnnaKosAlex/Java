package leveltwo.lesson2_1;

import leveltwo.lesson2_1.model.competitor.Cat;
import leveltwo.lesson2_1.model.competitor.Competitor;
import leveltwo.lesson2_1.model.competitor.Human;
import leveltwo.lesson2_1.model.competitor.Robot;
import leveltwo.lesson2_1.model.obstacle.Obstacle;
import leveltwo.lesson2_1.model.obstacle.Track;
import leveltwo.lesson2_1.model.obstacle.Wall;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {
                new Human("Pavel", 500, 2),
                new Human("Ludmila", 600, 3),
                new Cat("Lora", 200, 4),
                new Robot("R2D2", 100, 1),
                new Robot("Eva", 150, 1)
        };

        Obstacle[] obstacles = {
                new Track(300),
                new Wall(2)
        };

        for (Obstacle o : obstacles) {
            for (Competitor c : competitors) {
                if (c.onDistance()) {
                    o.overcome(c);
                }
            }
        }
    }
}
