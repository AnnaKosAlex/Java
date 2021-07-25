package leveltwo.lesson2_3.phonebook;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        int number = (int) (Math.random()*(600000+1)) + 2000000;

        String lastName1 = "Petrov";
        String lastName2 = "Popov";


        phoneBook.addingClients(lastName1, number);
        phoneBook.findTheClient(lastName1);
        phoneBook.addingClients(lastName2, number);
        phoneBook.findTheClient(lastName2);
    }

}
