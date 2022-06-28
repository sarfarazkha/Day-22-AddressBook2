
package com.bridgelabz.addressbook2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class AddressMain {
    static Map<String, AddressBook> addressBookMap = new HashMap<>();

    static Map<String, List<Contacts>> cityContactsMap = new HashMap<>();


    static Map<String, List<Contacts>> stateContactsMap = new HashMap<>();

    public static void main(String[] args) {
        Contacts c1 = new Contacts("sarfaraz", "khan", "sarfaraz@123",
                "9900", "shantinagar",
                440002, "Maharastra", "Mumbai");
        Contacts c2 = new Contacts("sartaj", "khan", "sartaj@123",
                "8800", "shantinagar",
                440002, "Karnataka", "Dharwad");
        Contacts c3 = new Contacts("taiyaba", "khan", "taiyaba@123",
                "7700", "shantinagar",
                440002, "Delhi", "Delhi");
        Contacts c4 = new Contacts("Paarth", "khan", "paarth@123",
                "9900", "Itwari",
                4400021, "Maharastra", "Pune");
        Contacts c5 = new Contacts("Pratham", "khan", "pratham@123",
                "9900", "Itwari",
                440002, "Karnataka", "Dharwad");
        Contacts c6 = new Contacts("Pavan", "khan", "pavan@123",
                "9900", "Itwari",
                440002, "Delhi", "agra");

        AddressBook addressBook1 = new AddressBook();
        addressBook1.contactsList.add(c1);
        addressBook1.contactsList.add(c2);
        addressBook1.contactsList.add(c3);
        addressBook1.contactsList.add(c3);
        addressBook1.contactsList.add(c4);
        addressBook1.contactsList.add(c5);

        addressBookMap.put("Addressbook1", addressBook1);


        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook addressBook = entry.getValue();
            List<Contacts> contactsList = addressBook.contactsList.stream().
                    filter(x -> x.getCity().equals("Mumbai")).collect(Collectors.toList());
            System.out.println(contactsList);
        }
    }
}





