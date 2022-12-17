package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayConverLsit {
    public static void main(String[] args) {
        List<String>stringList=new ArrayList<>();
        stringList.add("Robert Vogel");
        stringList.add("Mato kato");
        stringList.add("Luise kato");
        System.out.println(stringList);
        Iterator iterator=stringList.listIterator();
        while (iterator.hasNext()){
            String str= (String) iterator.next();
            System.out.println(str);
        }
    }
}
