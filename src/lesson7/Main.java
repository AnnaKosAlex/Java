package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Bars", 10, false),
                new Cat("Luna", 15, false),
                new Cat("Melisa", 7, true)
        };
        Plate plate = new Plate(5);

        plate.info();


        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite() && !cat.isSatiety()){
                cat.eat(plate);
                cat.setSatiety(true);
                System.out.println("Cat ate well!");
                System.out.println(cat.isSatiety());
            }else if (plate.getFood() >= cat.getAppetite() && cat.isSatiety()){
                System.out.println("I'm not hungry!");
                System.out.println(cat.isSatiety());
            }else if (plate.getFood() < cat.getAppetite() && !cat.isSatiety()){
                System.out.println("There is not enough food!!!");
                System.out.println(cat.isSatiety());
            }else if (plate.getFood() < cat.getAppetite() && cat.isSatiety()){
                System.out.println("I'm not hungry!");
                System.out.println(cat.isSatiety());
            }

        }
        plate.info();

        plate.increaseFood(60);
        plate.info();
    }

}

