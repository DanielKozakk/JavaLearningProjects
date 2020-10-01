package com.company;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;
import com.company.serie2.*;

public class Main {

    public static void main(String[] args) {


        Collections_28_FindKthMaximumValueInABinarySearchTree col28 = new Collections_28_FindKthMaximumValueInABinarySearchTree();

        col28.insert(10);
        col28.insert(15);
        col28.insert(5);
        col28.insert(8);
        col28.insert(7);
        col28.insert(4);
        col28.insert(12);
        col28.insert(16);

        col28.findKthMaximumValue(1);

    }
}
