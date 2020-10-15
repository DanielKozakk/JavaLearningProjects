package com.company;

import com.company.serie3.Collections_26_SearchBinaryTree;
import com.company.serie3.Collections_27_FindHeight;
import com.company.serie3.SearchBinaryTree_Serie3;

public class Main {

    public static void main(String[] args) {

        SearchBinaryTree_Serie3 serie3 = new SearchBinaryTree_Serie3(10);

        serie3.insert(15);
        serie3.insert(5);
        serie3.insert(8);
        serie3.insert(7);
        serie3.insert(4);
        serie3.insert(12);
        serie3.insert(16);

        serie3.Collections_28_FindKthMaximumValue(5);

    }
}
