package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String>listStr=new ArrayList<>();
        listStr.add("Mango");
        listStr.add("Apple");
        listStr.add("Banana");
        listStr.add("Papaya");
        listStr.add("Grapes");
        listStr.add("Grapes");

        System.out.println(listStr);
        //list is an interface of the collection framework
        //list is allow duplicate key
        //it is follow insertion order

    }
}
