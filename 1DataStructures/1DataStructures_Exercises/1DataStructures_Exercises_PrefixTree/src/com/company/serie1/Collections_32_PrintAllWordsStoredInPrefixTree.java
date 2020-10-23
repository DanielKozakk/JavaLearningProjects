//package com.company.serie1;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class Collections_32_PrintAllWordsStoredInPrefixTree extends Collections_31_ImplementPrefixTree {
//
//    public static char childrenArrayIndexToValue(int index) {
//        int asciiValue = index + 'a';
//        return (char) asciiValue;
//
//    }
//
//    public void printAllWords() {
//
//
//        Collections_31_ImplementPrefixTree searched = this;
//        Stack<Collections_31_ImplementPrefixTree> unvisitedNodes = new Stack<>();
//
//        unvisitedNodes.add(searched);
//
//        StringBuilder sb = new StringBuilder();
//
//        while (!unvisitedNodes.isEmpty()) {
//            boolean isNodeExhausted = true;
//
//
//            for (int i = 0; i < searched.children.length; i++) {
//                Collections_31_ImplementPrefixTree child =  searched.children[i];
//
//                if (child != null && !child.isNodeVisited) {
//
//                    unvisitedNodes.add(child);
//                    searched = child;
//
//                    sb.append(Collections_32_PrintAllWordsStoredInPrefixTree.childrenArrayIndexToValue(i));
//                    if(child.isNodeEndOfWord()){
//                        System.out.println(sb);
//                    }
//                    isNodeExhausted = false;
//
//                    break;
//                }
//
//            }
//
//            if (isNodeExhausted) {
//                searched.setNodeAsVisited();
//
//                if(sb.length() != 0) {
//                    sb.deleteCharAt(sb.length() - 1);
//                }
//                unvisitedNodes.pop();
//                if (!unvisitedNodes.isEmpty()) {
//                    searched = unvisitedNodes.peek();
//                }
//            }
//
//        }
//    }
//
//}
