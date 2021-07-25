package leveltwo.lesson2_3.phonebook;

import java.util.*;

public class PhoneBook {

    private Map<String, Set<Integer>> clients = new HashMap<>();

    public void addingClients(String lastName, int number) {
        Set<Integer> num = new HashSet<>();

        if (this.clients.containsKey(lastName)) {
            num = this.clients.get(lastName);
            num.add(number);
            this.clients.put(lastName, num);
        } else {
            num.add(number);
            this.clients.put(lastName, num);
        }
        System.out.println("We add " + lastName + ".");

    }

    public String findTheClient(String lastName) {
        String res = "";

        if (this.clients.containsKey(lastName)) {
            res = "Telephone number of client " + lastName + ": " +
                    this.clients.get(lastName).toString()
                            .replace("[","")
                            .replace("]", "")
                            .replace(",", "")
                            .trim();
            System.out.println(res);
        } else {
            res = "There is not client with this lastname in phonebook.";
            System.out.println(res);
        }

        return res;
    }
}
