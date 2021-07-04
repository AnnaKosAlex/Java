package LevelOne.lesson1_7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        food -= n;
    }

    public void increaseFood(int n){
        food += n;
        System.out.println("We put on the plane " + n + "g of food!");
    }

    public void  info(){
        System.out.println("plate: " + food);
    }
}
