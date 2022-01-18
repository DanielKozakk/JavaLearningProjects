package com.company.linkedList.serie1;

import com.company.linkedList.template.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Collections_16 extends LinkedList {

    public boolean detectLoopInLinkedList(){

        /*
         1. Dodaję hashMapę <Object, liczba pointerów>
         2. W pierwszej iteracji dodaję wszystkie obiekty do hashmapy, z pointerem 0.
         3. Znowu się iteruję i dodaję liczenie pointerów.
         4. Pierwszy element powinien mieć zero pointerów.
         5. Ostatni powinien wskazywać na nulla.
         6. Każdy Powinien mieć tylko jeden pointer na siebie.
         */

        Map<Node, Integer> countOfPointerHashMap = new HashMap<>();

        Node searchedElement = getFirstElement();

        while(searchedElement != null){
            countOfPointerHashMap.put(searchedElement, 0);
            searchedElement = searchedElement.getNext();
        }

        searchedElement = getFirstElement();



        while(searchedElement.getNext() != null){

            Integer countOfPointers = countOfPointerHashMap.get(searchedElement.getNext());
            countOfPointers += 1;
            if(searchedElement != null) {
                countOfPointerHashMap.put(searchedElement, countOfPointers);
            }
            searchedElement = searchedElement.getNext();
        }
        countOfPointerHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return true;
    }
}
