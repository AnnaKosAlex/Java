package LevelTwo.Lesson2_1;

import LevelTwo.Lesson2_1.Entity.Cat;
import LevelTwo.Lesson2_1.Entity.Entities;
import LevelTwo.Lesson2_1.Entity.Human;
import LevelTwo.Lesson2_1.Entity.Robot;
import LevelTwo.Lesson2_1.Lets.Lets;
import LevelTwo.Lesson2_1.Lets.RunningTrack;
import LevelTwo.Lesson2_1.Lets.Wall;

public class Main {
    public static void main(String[] args) {

        RunningTrack track = new RunningTrack();
        Wall wall = new Wall();

        Entities[] players = new Entities[5];
        players[0] = new Human("Pavel", 500, 2);
        players[1] = new Human("Ludmila", 600, 3);
        players[2] = new Cat("Lora", 200, 4);
        players[3] = new Robot("R2D2", 100, 1);
        players[4] = new Robot("Eva", 150, 1);

        Lets[] lets = new Lets[2];
        lets[0] = new RunningTrack(300);
        lets[1] = new Wall(2);


        for (Entities player : players) {
            for (Lets let : lets) {
                if (let instanceof RunningTrack) {
                    if(track.overcome(player)){
                        System.out.println("You run over " + ((RunningTrack) let).getDistance() + "m!");
                    }else {
                        System.out.println("This is too long distance for you! You out of the game!");
                        break;
                    }
                } else if (let instanceof Wall) {
                    if(wall.overcome(player)){
                        System.out.println("You jump over " + ((Wall) let).getHeight() + "m!");
                    }else{
                        System.out.println("This is too height for you! You out of the game!");
                        break;
                    }

                }

            }

        }
    }
}
