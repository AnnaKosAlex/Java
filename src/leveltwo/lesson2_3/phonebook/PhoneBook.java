package leveltwo.lesson2_3.phonebook;

import java.util.*;

public class PhoneBook {

    Map<String, List<Integer>> phoneClient = new HashMap<>();

    int number;

    public PhoneBook(Map<String, List<Integer>> phoneClient) {
        this.phoneClient = phoneClient;
    }

    public void createPhoneBook(Map<String, List<Integer>> phoneClient, List<Integer> numbers, String s, Integer i) {
        List<Integer> number = new ArrayList<>();

        if (this.phoneClient.containsKey(s)) {
            numbers = this.phoneClient.get(s);
            numbers.add(i);
            this.phoneClient.put(s, number);
        } else {
            numbers.add(i);
            this.phoneClient.put(s, number);
        }

        numbers.add(4950386);
        numbers.add(4951161);
        numbers.add(4952936);
        numbers.add(4952123);
        numbers.add(4953945);
        numbers.add(4954937);
        numbers.add(4952947);
        numbers.add(4953957);
        numbers.add(4959275);
        numbers.add(4958965);


        System.out.println(phoneClient);
    }

    public static void addingClients(Map<String, List<Integer>> phoneClient, List<Integer> numbers) {


        phoneClient.put("Petrov", numbers);
        phoneClient.put("Popov", numbers);
        phoneClient.put("Pavlov", numbers);
        phoneClient.put("Petrova", numbers);
        phoneClient.put("Kanceva", numbers);
        phoneClient.put("Lososev", numbers);
        phoneClient.put("Kostyuk", numbers);
        phoneClient.put("Ryazancev", numbers);
        phoneClient.put("Ivanov", numbers);
        phoneClient.put("Ivanova", numbers);


    }


    public static String findTheClient(Map<String, List<Integer>> phoneClient, String s) {
        String res = "";

        if (phoneClient.containsKey(s)) {
            res = "Телефон клиента " + s + ": " +
                    phoneClient.get(s).toString()
                            .replace("[", "")
                            .replace("]", "")
                            .replace(",", "")
                            .trim();
            System.out.println(res);
        } else {
            res = "Такого клиента нет в справочнике";
            System.out.println(res);
        }

        return res;
    }
}
