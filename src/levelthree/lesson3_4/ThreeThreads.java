package levelthree.lesson3_4;


public class ThreeThreads {
    String nextString = "A";

    public void print(String string, String nextString) {
        synchronized (this) {
            while (!string.equals(this.nextString)) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.nextString = nextString;
            System.out.print(string);
            notifyAll();
        }
    }

}
