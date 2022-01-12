package com.company;

public class Main {

    public static void main(String[] args) {

        Collections_12_ImplementStackUsingQueues col12 = new Collections_12_ImplementStackUsingQueues();
        col12.push("ABC");
        System.out.println(col12.peek());

        col12.pop();
        System.out.println(col12.peek());


    }
}
