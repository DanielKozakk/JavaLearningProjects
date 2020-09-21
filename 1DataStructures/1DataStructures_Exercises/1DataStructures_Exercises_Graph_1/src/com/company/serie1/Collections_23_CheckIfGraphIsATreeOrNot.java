package com.company.serie1;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.*;

public class Collections_23_CheckIfGraphIsATreeOrNot extends AdjacencyListDirectedRawGraph {


    public Collections_23_CheckIfGraphIsATreeOrNot(int graphSize) {
        super(graphSize);
    }


    public void isGraphTree() {

        /*
        Pierwszy problem - zapisywanie następnych Vertexów do iteracji - DONE

        Drugi problem - śledzenie ich poziomu
        Trzeci problem - sprawdzanie, czy w poziomach następują powiązania
        Czwarty problem - sprawdzanie, czy powiązania występują tylko między niższym a wyższym poziomem.
        Piąty problem - jak sprawnie poruszać się po Vertexach już odwiedzonych, jak robić level down.

         */

        boolean areGraphRounded = false;

        Queue<Vertex> vertexQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[0];
        vertexQueue.add(searchedVertex);

        Integer levelOfNeighbours = 0;

        HashMap<Integer, Integer> levels = new HashMap<>();
        levels.put(searchedVertex.ID, 0);

        while (!vertexQueue.isEmpty()) {

            searchedVertex.setVertexAsVisited();

            if (!searchedVertex.listOfEdges.isEmpty()) {
                levelOfNeighbours++;
            }

            for (Integer neighbourId : searchedVertex.listOfEdges) {
                if (!vertices[neighbourId].isVertexVisited && !vertexQueue.contains(vertices[neighbourId])) {
                    vertexQueue.add(vertices[neighbourId]);

                    levels.put(neighbourId, levelOfNeighbours);
                }
            }
            vertexQueue.poll();

            for (Integer id : levels.keySet()) {
                Integer firstVertexLevel = levels.get(id);
                Integer numberOfUpperNodes = 0;
                ArrayList<Integer> upperNodesIds = new ArrayList<>();

                for (Integer idToCompare : levels.keySet()) {
                    if (id.equals(idToCompare)) continue;
                    if (numberOfUpperNodes > 1) {
                        areGraphRounded = true;
                        break;
                    }

                    Integer secondVertexLevel = levels.get(idToCompare);

                    // Sprawdza node'y na tym samym poziomie.
                    if (firstVertexLevel.equals(secondVertexLevel) && vertices[id].listOfEdges.contains(idToCompare)) {
                        areGraphRounded = true;
                        break;
                    }

                    if (vertices[id].listOfEdges.contains(idToCompare)) {

                        Integer upperLevel = firstVertexLevel - 1;
                        Integer bottomLevel = firstVertexLevel + 1;

                        if (secondVertexLevel.equals(upperLevel)) {
                            numberOfUpperNodes++;
                            upperNodesIds.add(idToCompare);
                            continue;
                        } else if (secondVertexLevel.equals(bottomLevel)) {
                            continue;
                        } else {
                            areGraphRounded = true;
                            break;
                        }
                    }
                }
                if (areGraphRounded) {
                    break;
                }
            }
            if (areGraphRounded) {
                break;
            }

            if (!vertexQueue.isEmpty()) {
                searchedVertex = vertexQueue.peek();
                levelOfNeighbours = levels.get(searchedVertex.ID);
            }
        }
        if (areGraphRounded) {
            System.out.println("Graph");
        } else {
            System.out.println("Tree!");

        }
    }
}
