package levelthree.lesson3_4;

public class Main {

    private final ThreeThreads threeThreads = new ThreeThreads();

    public static void main(String[] args){
        new Main().creatingThreeThreads();
    }

    public void creatingThreeThreads(){
        createTread("A", "B").start();
        createTread("B", "C").start();
        createTread("C", "A").start();
    }

    private Thread createTread(String string, String nextString) {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                threeThreads.print(string, nextString);
            }
        });
    }
}
