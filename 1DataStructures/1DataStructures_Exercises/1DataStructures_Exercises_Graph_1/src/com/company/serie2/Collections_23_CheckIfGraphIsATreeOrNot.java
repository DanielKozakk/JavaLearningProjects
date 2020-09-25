package com.company.serie2;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_23_CheckIfGraphIsATreeOrNot extends AdjacencyListDirectedRawGraph {


    public Collections_23_CheckIfGraphIsATreeOrNot(int graphSize) {
        super(graphSize);
    }


    public boolean checkIfGraphIsATree() {



        /*


                1. Graph nie jest tree, jeśli jakiś node ma więcej niż jedno połączenie z wyższym poziomem.
                2. Graph nie jest tree, jeśli jakiś node ma połączenia z sibblings.


                Robię queue do sprawdzania
                searched vertex = pierwszy

                Robiośe HashMapę<Integer, integer> (id vertexu, poziom)

                dodaję vertexdo queue
                do hashMapy dodaję vertexId, 0

                int level = 0;

                pętlą, która działa dopóki queue nie jest puste

                    Iteruję się po neighbour
                        level ++;

                        jeśli neighbour nie jest visited, nie jest w queue  to
                            dodaje neighbour do kolejki
                            hashMap.put(neighbour.id, level)

                searchedVertex.setAsVisited();
                queue.pop;
                if(queue nie jhest puste)

                    searched = queue.peek();

                koniec pętli while.


                isTreeGraph = false
                Teraz iteruję się przez hashmapę, iteruje przez id

                    int numberOfParents = 0;

                    Robię wewnętrzną pętlę, też przez id



                        Jeśli id zew i wew nie są takie same && jeśli zewnętrznyid ma sąsiada wewnętrznyid

                         if(jeśli oboje są na tym samym poziomie)

                            isTreeGraph = true
                            break;

                         if(level wewnętrznego > level zewnętrznego)

                            numberOfParents ++;

                         if(numberOfParents > 1){
                            isTreeGraph = true
                            break;
                         }


                if(isTreeGraph)
                    break

               return isTreeGraph

         */

        Queue<Vertex> unvisitedVerticesQueue = new LinkedList<>();
        Vertex searchedVererx = vertices[0];

        HashMap<Integer, Integer> levels = new HashMap<>();

        unvisitedVerticesQueue.add(searchedVererx);

        int level = 0;

        levels.put(searchedVererx.getId(), level);

        while (!unvisitedVerticesQueue.isEmpty()) {

            level++;

            for (int i = 0; i < searchedVererx.listOfEdges.size(); i++) {

                Integer neighbourId = searchedVererx.listOfEdges.get(i);
                Vertex neighbour = vertices[neighbourId];


                if (!neighbour.isVertexVisited() && !unvisitedVerticesQueue.contains(neighbour)) {
                    unvisitedVerticesQueue.add(neighbour);
                    levels.put(neighbourId, level);
                }
            }
            searchedVererx.setVertexAsVisited();
            unvisitedVerticesQueue.poll();

            if (!unvisitedVerticesQueue.isEmpty()) {
                searchedVererx = unvisitedVerticesQueue.peek();

                level = levels.get(searchedVererx.getId());
            }

        }

        boolean isTreeGraph = true;

        for (int i = 0; i < levels.size(); i++) {

            Vertex firstVertex = vertices[i];
            int numberOfParents = 0;
            for (int j = 0; j < levels.size(); j++) {

                if(i != j && firstVertex.listOfEdges.contains(j)){
                    if(levels.get(i).equals(levels.get(j))){
                        isTreeGraph = false;
                        break;
                    }

                    if(levels.get(j) < levels.get(i)){
                        numberOfParents ++;
                    }

                    if(numberOfParents > 1){
                        isTreeGraph = false;
                        break;
                    }

                }
            }

            if(!isTreeGraph){
                break;
            }
        }

        return isTreeGraph;


    }
}
