package levelthree.lesson3_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> box;

    public Box(){
        this.box = new ArrayList<>();
    }

    public float getWeight() {
        if(box.size() > 0) {
            return box.size() * box.get(0).getWeight();
        }
        return 0.0f;
    }

    public boolean compare(Box box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.0001;
    }

    public void putIntoBox(T fruit) {
        box.add(fruit);
    }

    public void reputFruits(Box<T> box) {
        Iterator<T> fruitIterator = this.box.iterator();
        while(fruitIterator.hasNext()) {
            T fruit = fruitIterator.next();
            box.box.add(fruit);
            fruitIterator.remove();
        }

    }
}
