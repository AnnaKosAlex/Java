package levelone.lesson1_6;

public class Dog extends Animal{

    private static int count = 0;

    public static int count(){
        return count++;
    }

    @Override
    public void run(int lenght, String name) {
        if (lenght <= 500) {
            System.out.println(name + " can run over " + lenght + " m!");
        } else {
            System.out.println("It's too much for a " + name + "!!!");
        }
    }

    @Override
    public void swim(int lenght, String name) {
        if (lenght <= 10) {
            System.out.println(name + " can swim over " + lenght + " m!");
        } else {
            System.out.println("It's too much for a " + name + "!!!");
        }
    }
}
