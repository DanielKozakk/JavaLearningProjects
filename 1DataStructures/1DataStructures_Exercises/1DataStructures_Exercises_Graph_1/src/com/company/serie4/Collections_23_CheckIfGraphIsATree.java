package com.company.serie4;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_23_CheckIfGraphIsATree extends AdjacencyListDirectedRawGraph {


    public Collections_23_CheckIfGraphIsATree(int graphSize) {
        super(graphSize);
    }

    public boolean checkIfGraphIsATree() {



        /*

                Pierwsza rzecz to zrobienie struktury leveli. Trzeba się przeiterować przez wszystkie node`y, zrobić hashMapę, która będzie wskazywać na poziom.

                Następnie trzeba się ponownie przeiterować przez nody, sprawdzając, czy sąsiedzi mają level albo o jeden wyższy albo o jeden niższy.
                Również trzeba sprawdzić, czy node ma jednego rodzica.


         */


        HashMap<Integer, Integer> levels = new HashMap<>();

        Vertex searched = vertices[0];

        int level = 0;

        levels.put(searched.getId(), level);

        Queue<Vertex> unvisitedVericesQueue = new LinkedList<>();
        unvisitedVericesQueue.add(searched);

        while (!unvisitedVericesQueue.isEmpty()) {

            level = levels.get(searched.getId());
            level++;
            for (Integer neighbourId : searched.listOfEdges) {
                if (!vertices[neighbourId].isVertexVisited()) {
                    unvisitedVericesQueue.add(vertices[neighbourId]);
                    levels.put(neighbourId, level);
                    vertices[neighbourId].setVertexAsVisited();
                }
            }
            unvisitedVericesQueue.poll();
            searched.setVertexAsVisited();
            if (!unvisitedVericesQueue.isEmpty()) {
                searched = unvisitedVericesQueue.peek();
            }

        }

        boolean isVertexTree = true;

        for (Integer primaryVertexId : levels.keySet()) {
            System.out.println("For key " + primaryVertexId + " there is value of " + levels.get(primaryVertexId));

            Vertex primaryVertex = vertices[primaryVertexId];
            int numberOfParents = 0;

            for (Integer neighbourId : primaryVertex.listOfEdges) {

                Vertex neighbour = vertices[neighbourId];

                int levelOfPrimaryVertex = levels.get(primaryVertexId);
                int levelOfNeighbour = levels.get(neighbourId);

                if(levelOfNeighbour == (levelOfPrimaryVertex)){
                    isVertexTree = false;
                    break;
                }

                if(levelOfPrimaryVertex == levelOfNeighbour + 1){
                    numberOfParents ++;
                    if(numberOfParents > 1){
                        isVertexTree = false;
                        break;
                    }
                }
            }



        }
        return isVertexTree;
    }
}
