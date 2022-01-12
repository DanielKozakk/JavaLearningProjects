package com.company.serie3;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_23_CheckIfGraphIsATreeOrNot extends AdjacencyListDirectedRawGraph {

    public Collections_23_CheckIfGraphIsATreeOrNot(int size) {
        super(size);
    }

    public boolean checkIfGraphIsTree() {

        /*

                Elementy do sprawdzenia -
                1. Czy node na tym samym poziomie mają powiązania, jeśli tak to zwróć false
                2. Sprawdź czy każdy z node`ów ma maksymalnie jedno połączenie z wyższym nodem. Jeśli nie to false;

                UnvisitedQueue = new LinkedList
                searched = verticies[0]

                unvisited.add(searched)
                levelsHAshMap <node.id, level>
                levelsHashMap.put(searched.id, 0)
               level;

                while(unvisited.isnotempty)
                    level = levelsHashMap.get(searched.id)
                    level ++;
                    iteruje po sąsiadach

                        jesli nie jest visited

                            dodaję go do levelsHashMap jako neighbour.id, level
                            dodaję do unvisited
                    unvisitedQueue.poll
                    jeśli nie jest pusta to ustaw peek jako następny searched

                isGraphTree = true;
                numberOfParents = 0;
                 for elements in hashMapLevels - key i

                    for elementsInhashMapLevels - key j

                        Jeśli element i ma powiązanie z j
                          jeśli node są na tym samym poziomie
                            isGraphTree = false;
                            break
                          jesli node jest na wyższym poziome :
                            number of parents ++;
                                jesli nubmerofParnets > 1
                                    isGraphTree = false;
                                    berak;
         */

        Queue<Vertex> unvisitedNodes = new LinkedList<>();
        Vertex searched = vertices[0];
        unvisitedNodes.add(searched);

        Integer level = 0;
        // searched.id, levels
        HashMap<Integer, Integer> levelsHashMap = new HashMap<>();
        levelsHashMap.put(searched.getId(), level);

        while (!unvisitedNodes.isEmpty()) {
            level = levelsHashMap.get(searched.getId());
            level++;

            for (int i = 0; i < searched.listOfEdges.size(); i++) {
                Integer neighbourId = searched.listOfEdges.get(i);
                Vertex neighbour = vertices[neighbourId];

                if (!neighbour.isVertexVisited() && !unvisitedNodes.contains(neighbour)) {
                    levelsHashMap.put(neighbourId, level);
                    unvisitedNodes.add(neighbour);
                }
            }

            searched.setVertexAsVisited();
            unvisitedNodes.poll();
            if (!unvisitedNodes.isEmpty()) searched = unvisitedNodes.peek();
        }
        boolean isGraphTree = true;
        for (Integer mainNodeId : levelsHashMap.keySet()) {

            Vertex firstNode = vertices[mainNodeId];
            Integer numberOfParentsOfFirstNode = 0;


            for (Integer neighbourNodeId : firstNode.listOfEdges) {

                if (!mainNodeId.equals(neighbourNodeId) && firstNode.listOfEdges.contains(neighbourNodeId)) {

                    Integer firstNodeLevel = levelsHashMap.get(mainNodeId);
                    Integer secondNodeLevel = levelsHashMap.get(neighbourNodeId);

                    if (firstNodeLevel.equals(secondNodeLevel)) {
                        isGraphTree = false;
                        break;
                    }
                    if (secondNodeLevel.equals(firstNodeLevel - 1)) {
                        numberOfParentsOfFirstNode++;
                        if (numberOfParentsOfFirstNode > 1) {
                            isGraphTree = false;
                            break;
                        }
                    }

                }
            }


            if (!isGraphTree) {
                break;
            }
        }

        return isGraphTree;
    }
}
