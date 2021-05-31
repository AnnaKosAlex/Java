package lesson5;

public class WorkersArray {
    public static void findTheOldest(){
        Worker[] workers = {
                new Worker("Anna", "doctor", "anna@mail.ru", "384859739", 70000, 50),
                new Worker("Olga", "waiter", "olga@mail.ru", "402576", 20000, 20),
                new Worker("Elena", "cleaner", "elena@mail.ru", "3846567", 40000, 35),
                new Worker("Nikita", "engineer", "nikita@mail.ru", "09843534", 60000, 60),
                new Worker("Anton", "programmer", "anton@mail.ru", "9876425", 120000, 24)
        };

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40){
                System.out.println(workers[i].toString());
            }

        }
    }
}
