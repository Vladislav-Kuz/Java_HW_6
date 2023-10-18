package org.example;

import java.util.*;

class Phonebook {
    private static HashMap< String, ArrayList > contacts = new HashMap<>();

    public static void add(String name, String phone) {
        if (contacts.containsKey(name)) {
            ArrayList <Object> phoneNum = contacts.get(name);
            phoneNum.add(phone);
            contacts.put(name, phoneNum);
        } else {
            ArrayList< Object > phoneNum = new ArrayList<>();
            phoneNum.add(phone);
            contacts.put(name, phoneNum);
        }
    }
    public ArrayList<String> get(String name) {

        ArrayList< Map.Entry < String, ArrayList > > list = new ArrayList<>(contacts.entrySet());
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry< String, ArrayList > entry : list) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                result.add((entry.getKey() + ":" + entry.getValue()).replace('[', ' ').replace(']', ' '));
            }
        }
        return result;
    }
    public static void showBook() {
        
        ArrayList< Map.Entry < String, ArrayList > > list = new ArrayList(contacts.entrySet());
        list.sort((o1, o2) -> (o2.getValue().size() - o1.getValue().size()));
        for (Map.Entry< String, ArrayList > entry : list) {
            System.out.println((entry.getKey() + " : " + entry.getValue()).replace('[', ' ').replace(']', ' '));
        }
    }
}

