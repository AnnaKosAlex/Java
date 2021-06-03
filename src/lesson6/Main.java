package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat alice = new Cat();
        Cat.count();
        Cat luna = new Cat();
        Cat.count();

        Dog bobic = new Dog();
        Dog.count();
        Dog tuzya = new Dog();
        Dog.count();

        alice.run(200, "Alice");
        alice.swim(5, "Alice");

        luna.run(400, "Luna");
        luna.swim(30, "Luna");

        bobic.run(400, "Bobic");
        bobic.swim(5, "Bobic");

        tuzya.run(670, "Tuzya");
        tuzya.swim(394, "Tuzya");

        System.out.println("Cats: " + Cat.count());
        System.out.println("Dogs: " + Dog.count());

    }
}
