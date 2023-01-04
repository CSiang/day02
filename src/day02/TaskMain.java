package day02;

import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashSet;

public class TaskMain {
    public static void main(String [] args) {

        List <Car> garage = new LinkedList<>();
        Set<String> addressbook = new HashSet<>();
        Map<String, Integer>  debts = new HashMap<>();  // Can't use int, must type Integer

        //Add cars to garage
        garage.add(new Car());
        garage.add(new Porche());

        System.out.println(garage);

        //Add names to my addressbook
        addressbook.add("fred");
        addressbook.add("barney");
        addressbook.add("wilma");
        addressbook.add("fred");
        System.out.println(addressbook); // Because this is a set, hence the 2nd fren will be excluded

        //Add my debtors
        debts.put("fred",10);
        debts.put("barney",10);
        debts.put("fred",100);
        System.out.println(debts); 
        // Because this is map (dictionary), 
        //hence the fred:10 will be updated to fred: 100 due to no duplicated key allowed.

        System.out.println(debts.get("fred"));

    }
}
