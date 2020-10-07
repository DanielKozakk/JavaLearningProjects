package com.company.serie2;

import com.company.PrefixTree;

import java.util.Stack;

public class Collections_32_PrintAllWordsStoredInPrefixTree extends PrefixTree {

    public static char turnIndexToChar(int index) {
        int asciiValue = 'a' + index;
        return (char) asciiValue;
    }

    public void printAllWords() {

        /*

                Zastosujemy tutaj depth first searched z budowaniem stringów.
                Robię unvisited nodes Stack

                searched ustawiam na this i dodaję do stacka

                robię flagę isVertexVisited = true;

                Robię string buldier

                iteruję się przez children

                    Zamieniam index na Node`a

                        jeśli node nie jest exhausted
                            searched = node
                            jeśli node jest końcem słowa
                                wypisuje SB
                            isVertexVisited= false;
                            dodaję do string buldiera wartość
                            unvisitedVertexStack.add(searched)
                            break;

                sprawdzam czy był wyczerpany

                    jeśli był :
                        buldier = buldier.deleteCharAt(str.length() - 1)
                        stack.pop()
                        jeśli stack nie pusty

                            searched = stack.peek()

         */


        Stack<PrefixTree> unvisitedNodesStack = new Stack<>();
        PrefixTree searched = this;

        StringBuilder sb = new StringBuilder();

        unvisitedNodesStack.add(searched);

        while (!unvisitedNodesStack.isEmpty()) {
            boolean isVertexExhausted = true;
            for (int i = 0; i < children.length; i++) {
                PrefixTree childNode = searched.getNode(turnIndexToChar(i));

                if (childNode != null && !childNode.isNodeVisited) {
                    searched = childNode;
                    sb.append(Collections_32_PrintAllWordsStoredInPrefixTree.turnIndexToChar(i));
                    if (searched.isNodeEndOfWord()) {
                        System.out.println(sb);

                    }
                    isVertexExhausted = false;
                    unvisitedNodesStack.add(searched);
                    break;

                }
            }
            if (isVertexExhausted) {
                searched.setNodeAsVisited();
                try {
                    sb = sb.deleteCharAt(sb.length() - 1);
                } catch(StringIndexOutOfBoundsException e){

                }
                unvisitedNodesStack.pop();
                if (!unvisitedNodesStack.isEmpty()) {
                    searched = unvisitedNodesStack.peek();
                }
            }

        }

    }
}
