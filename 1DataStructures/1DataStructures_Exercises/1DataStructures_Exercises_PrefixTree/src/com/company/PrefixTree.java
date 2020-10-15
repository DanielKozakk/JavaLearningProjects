package com.company;

import java.util.HashMap;

public class //package com.company.serie2;
//
//import com.company.PrefixTree;
//
//import java.util.Stack;
//
//public class Collections_32_PrintAllWordsStoredInPrefixTree extends PrefixTree {
//
//    public static char turnIndexToChar(int index) {
//        int asciiValue = 'a' + index;
//        return (char) asciiValue;
//    }
//
//    public void printAllWords() {
//
//        /*
//
//                Zastosujemy tutaj depth first searched z budowaniem stringów.
//                Robię unvisited nodes Stack
//
//                searched ustawiam na this i dodaję do stacka
//
//                robię flagę isVertexVisited = true;
//
//                Robię string buldier
//
//                iteruję się przez children
//
//                    Zamieniam index na Node`a
//
//                        jeśli node nie jest exhausted
//                            searched = node
//                            jeśli node jest końcem słowa
//                                wypisuje SB
//                            isVertexVisited= false;
//                            dodaję do string buldiera wartość
//                            unvisitedVertexStack.add(searched)
//                            break;
//
//                sprawdzam czy był wyczerpany
//
//                    jeśli był :
//                        buldier = buldier.deleteCharAt(str.length() - 1)
//                        stack.pop()
//                        jeśli stack nie pusty
//
//                            searched = stack.peek()
//
//         */
//
//
//        Stack<PrefixTree> unvisitedNodesStack = new Stack<>();
//        PrefixTree searched = this;
//
//        StringBuilder sb = new StringBuilder();
//
//        unvisitedNodesStack.add(searched);
//
//        while (!unvisitedNodesStack.isEmpty()) {
//            boolean isVertexExhausted = true;
//            for (int i = 0; i < children.length; i++) {
//                PrefixTree childNode = searched.getNode(turnIndexToChar(i));
//
//                if (childNode != null && !childNode.isNodeVisited) {
//                    searched = childNode;
//                    sb.append(Collections_32_PrintAllWordsStoredInPrefixTree.turnIndexToChar(i));
//                    if (searched.isNodeEndOfWord()) {
//                        System.out.println(sb);
//
//                    }
//                    isVertexExhausted = false;
//                    unvisitedNodesStack.add(searched);
//                    break;
//
//                }
//            }
//            if (isVertexExhausted) {
//                searched.setNodeAsVisited();
//                try {
//                    sb = sb.deleteCharAt(sb.length() - 1);
//                } catch(StringIndexOutOfBoundsException e){
//
//                }
//                unvisitedNodesStack.pop();
//                if (!unvisitedNodesStack.isEmpty()) {
//                    searched = unvisitedNodesStack.peek();
//                }
//            }
//
//        }
//
//    }
//}
//package com.company.serie2;
//
//import com.company.PrefixTree;
//
//import java.util.Stack;
//
//public class Collections_32_PrintAllWordsStoredInPrefixTree extends PrefixTree {
//
//    public static char turnIndexToChar(int index) {
//        int asciiValue = 'a' + index;
//        return (char) asciiValue;
//    }
//
//    public void printAllWords() {
//
//        /*
//
//                Zastosujemy tutaj depth first searched z budowaniem stringów.
//                Robię unvisited nodes Stack
//
//                searched ustawiam na this i dodaję do stacka
//
//                robię flagę isVertexVisited = true;
//
//                Robię string buldier
//
//                iteruję się przez children
//
//                    Zamieniam index na Node`a
//
//                        jeśli node nie jest exhausted
//                            searched = node
//                            jeśli node jest końcem słowa
//                                wypisuje SB
//                            isVertexVisited= false;
//                            dodaję do string buldiera wartość
//                            unvisitedVertexStack.add(searched)
//                            break;
//
//                sprawdzam czy był wyczerpany
//
//                    jeśli był :
//                        buldier = buldier.deleteCharAt(str.length() - 1)
//                        stack.pop()
//                        jeśli stack nie pusty
//
//                            searched = stack.peek()
//
//         */
//
//
//        Stack<PrefixTree> unvisitedNodesStack = new Stack<>();
//        PrefixTree searched = this;
//
//        StringBuilder sb = new StringBuilder();
//
//        unvisitedNodesStack.add(searched);
//
//        while (!unvisitedNodesStack.isEmpty()) {
//            boolean isVertexExhausted = true;
//            for (int i = 0; i < children.length; i++) {
//                PrefixTree childNode = searched.getNode(turnIndexToChar(i));
//
//                if (childNode != null && !childNode.isNodeVisited) {
//                    searched = childNode;
//                    sb.append(Collections_32_PrintAllWordsStoredInPrefixTree.turnIndexToChar(i));
//                    if (searched.isNodeEndOfWord()) {
//                        System.out.println(sb);
//
//                    }
//                    isVertexExhausted = false;
//                    unvisitedNodesStack.add(searched);
//                    break;
//
//                }
//            }
//            if (isVertexExhausted) {
//                searched.setNodeAsVisited();
//                try {
//                    sb = sb.deleteCharAt(sb.length() - 1);
//                } catch(StringIndexOutOfBoundsException e){
//
//                }
//                unvisitedNodesStack.pop();
//                if (!unvisitedNodesStack.isEmpty()) {
//                    searched = unvisitedNodesStack.peek();
//                }
//            }
//
//        }
//
//    }
//}
PrefixTree {

    private boolean isNodeEndOfWord = false;

    protected String wholeWord = null;

    public boolean isNodeVisited = false;

    public HashMap<Character, PrefixTree> children = new HashMap<>();


    public PrefixTree() {
    }

    protected PrefixTree(boolean isItEndOfWord) {
        this.isNodeEndOfWord = isItEndOfWord;
    }

    public void setWholeWord(String wholeWord){
        this.wholeWord = wholeWord;
    }
    public String getWholeWord(){
        return this.wholeWord;
    }
    public void setNodeAsEndOfWord() {
        isNodeEndOfWord = true;
    }

    public boolean isNodeEndOfWord() {
        return this.isNodeEndOfWord;
    }

    public void setNodeAsVisited() {
        this.isNodeVisited = true;
    }


    public PrefixTree getNode(char ch) {
        return children.get(ch);
    }

    public void setNode(char ch, PrefixTree node) {

        children.put(ch, node);

    }

    public void add(String string) {
        add(string, 0);
    }

    private void add(String string, int index) {

        if (string.length() == index) {
            return;
        }
        boolean isItEndOfWord = index + 1 == string.length();


        char ch = string.charAt(index);


        PrefixTree child = children.get(ch);

        if (child == null) {
            child = new PrefixTree(isItEndOfWord);

            if(isItEndOfWord) child.setWholeWord(string);

            setNode(ch, child);
        } else if (isItEndOfWord) {
            child.setWholeWord(string);
            child.setNodeAsEndOfWord();
        }

        child.add(string, index + 1);

    }


    public boolean contains(String s) {
        return contains(s, 0);
    }

    private boolean contains(String s, int index) {

        if (s.length() < index) {
            return false;
        }

        if (s.length() - 1 == index) {
            return true;
        }

        char currentChar = s.charAt(index);

        PrefixTree child = getNode(currentChar);

        if (child == null) {
            return false;
        }


        return child.contains(s, index + 1);

    }

}
