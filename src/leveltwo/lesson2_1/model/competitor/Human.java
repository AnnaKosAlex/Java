package leveltwo.lesson2_1.model.competitor;

import java.util.Objects;

public class Human implements Competitor {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;
    private boolean onDistance = true;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println(name + " перепрыгнул препятствие");
        } else {
            System.out.println(name + " выбыл");
            onDistance = false;
        }
    }

    @Override
    public void run(int distance) {
        if (maxRunDistance >= distance) {
            System.out.println(name + " пробежал дистанцию.");
        } else {
            System.out.println(name + " выбыл");
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
        Human human = (Human) o;
        return maxRunDistance == human.maxRunDistance &&
                maxJumpHeight == human.maxJumpHeight &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxRunDistance, maxJumpHeight);
    }
}
