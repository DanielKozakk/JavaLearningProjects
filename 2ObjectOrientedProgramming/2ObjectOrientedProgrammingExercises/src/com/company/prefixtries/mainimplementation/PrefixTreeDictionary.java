package com.company.prefixtries.mainimplementation;

import com.company.prefixtries.mainimplementation.AbstractPrefixTree;

import java.util.HashMap;

public class PrefixTreeDictionary extends AbstractPrefixTree {

    protected PrefixTreeDictionary(HashMap<Character, ? extends AbstractPrefixTree> children, Character character) {
        super(children, character);
    }

    @Override
    public void addWord(String word) {

    }

    @Override
    public boolean contains(String word) {
        return false;
    }
}
