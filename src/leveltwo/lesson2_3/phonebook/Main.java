package leveltwo.lesson2_3.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> phoneClients = new HashMap<>();

        String s = "Popov";
        PhoneBook phoneBook = new PhoneBook();

        PhoneBook.addingClients(phoneClients);
        PhoneBook.findTheClient(phoneClients,s);
    }

}
