package levelone.lesson1_6;

public class Cat extends Animal {

    private static int count = 0;

    public static int count(){
        return count++;
    }

    @Override
    public void run(int lenght, String name) {
        if (lenght <= 200) {
            System.out.println(name + " can run over " + lenght + " m!");
        } else {
            System.out.println("It's too much for a " + name + "!!!");
        }
    }

    @Override
    public void swim(int lenght, String name) {
        System.out.println(name + " can't swim!");
    }
}
