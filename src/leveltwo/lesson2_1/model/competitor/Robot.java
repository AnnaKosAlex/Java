package leveltwo.lesson2_1.model.competitor;

import java.util.Objects;

public class Robot implements Competitor {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;
    private boolean onDistance = true;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println(name + " jumped over the wall.");
        } else {
            System.out.println(name + " is out");
            onDistance = false;
        }
    }

    @Override
    public void run(int distance) {
        if (maxRunDistance >= distance) {
            System.out.println(name + " run the distance.");
        } else {
            System.out.println(name + " is out");
            onDistance = false;
        }
    }

    @Override
    public boolean onDistance() {
        return onDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return maxRunDistance == robot.maxRunDistance &&
                maxJumpHeight == robot.maxJumpHeight &&
                Objects.equals(name, robot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxRunDistance, maxJumpHeight);
    }
}
