package com.company;

import com.company.serie1.Collections_33_ImplementDictionaryUsingTrie;

public class Main {

    public static void main(String[] args) {

        Collections_33_ImplementDictionaryUsingTrie col33 = new Collections_33_ImplementDictionaryUsingTrie();

        col33.add("majeranek", "Gatunek ptaka z rodziny ruchowatych");
        col33.add("maj", "Miesiąc przed kwietniem.");
       String def = col33.findDefinition("majerane");

       System.out.println(def);

    }
}
