package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static LinkedList<String> linkedList = new LinkedList<>();

    public static void main(String[] args) {

        linkedList.add("pierwszy");
        linkedList.add("drugi");
        linkedList.add("trzeci");
        linkedList.add(1, "Prawdziwy Drugi!");

//        printElements("Dodawanko : ");

//        linkedList.removeFirst();
//        linkedList.removeLast();

//        printElements("Odejmowanko : ");

//        linkedList.remove(2);
//        printElements("Odejmuję element o indexie 0");


    }

    public static void printElements(String message) {
        Iterator<String> iterator = linkedList.iterator();

        System.out.println("");
        System.out.println(message);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    ;

}
