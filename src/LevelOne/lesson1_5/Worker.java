package LevelOne.lesson1_5;

public class Worker {

    private String name;
    private String position;
    private String email;
    private String number;
    private int wage;
    private int age;

    public Worker(String name, String position, String email,
                  String number, int wage, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.wage = wage;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void printInformation(String name, String position,
                                        String email, String number,
                                        int wage, int age){
        System.out.printf("Name: %s , Position: %s , Email: %s , " +
                        "Number %s , Wage %d , Age: %s%n",
                name, position, email, number, wage, age);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", wage=" + wage +
                ", age=" + age +
                '}';
    }
}
