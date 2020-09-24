package com.company;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;
import com.company.serie1.Collections_27_FindHeightOfABinaryTree;
import com.company.serie1.Collections_28_FindKthMaximumValueInTrie;

public class Main {

    public static void main(String[] args) {

        Collections_28_FindKthMaximumValueInTrie col28 = new Collections_28_FindKthMaximumValueInTrie(10);

        col28.insert(15);
        col28.insert(5);
        col28.insert(8);
        col28.insert(7);
        col28.insert(4);
        col28.insert(12);
        col28.insert(16);

//        System.out.println(Collections_28_FindKthMaximumValueInTrie.size);

        col28.findKthMinimumValue(8);


    }
}
