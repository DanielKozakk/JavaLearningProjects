package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add(2);
        list.add(true);

        int a = 0;

        list.add(a);



        String str = (String)list.get(0);
    }
}
