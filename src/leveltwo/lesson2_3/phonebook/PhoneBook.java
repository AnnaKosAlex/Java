package leveltwo.lesson2_3.phonebook;

import java.util.*;

public class PhoneBook {

    public static void addingClients(Map<String, Integer> phoneClient) {
        phoneClient.put("Petrov", 4958965);
        phoneClient.put("Popov", 4959275);
        phoneClient.put("Pavlov", 4953957);
        phoneClient.put("Petrova", 4952947);
        phoneClient.put("Kanceva", 4954937);
        phoneClient.put("Lososev", 4952123);
        phoneClient.put("Kostyuk", 4952936);
        phoneClient.put("Ryazancev", 4953945);
        phoneClient.put("Ivanov", 4951161);
        phoneClient.put("Ivanova", 4950386);

    }

    public static String findTheClient(Map<String, Integer> phoneClient, String s) {
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
