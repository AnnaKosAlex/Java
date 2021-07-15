package leveltwo.lesson2_3.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, List<Integer>> phoneClients = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook(phoneClients);
        String s = "Popov";
        Integer i = 0;
        PhoneBook.addingClients(phoneClients,numbers);
        phoneBook.createPhoneBook(phoneClients,numbers, s, i);
        PhoneBook.findTheClient(phoneClients,s);
    }

}
