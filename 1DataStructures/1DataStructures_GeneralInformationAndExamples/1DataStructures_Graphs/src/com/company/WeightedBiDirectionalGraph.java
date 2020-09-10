package com.company;

import java.util.*;

public class WeightedBiDirectionalGraph {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertecies;

    public WeightedBiDirectionalGraph(int graphSize) {
        this.graphSize = graphSize;
        this.vertexRemains = graphSize;
        vertecies = new Vertex[graphSize];
    }


    public void addVertex(String name) {

        if (vertexRemains > 0) {
            vertexRemains--;
            Vertex newVertex = new Vertex(name);
            vertecies[VertexID] = newVertex;
            VertexID++;
        } else {
            System.out.println("There is no place for next vertex!");
        }

    }

    public void addEdge(Integer pointAid, Integer pointBid, Integer weight) {

        if (vertecies[pointAid] != null && vertecies[pointBid] != null) {

            Edge edge1 = new Edge(pointAid, pointBid, weight);
            Edge edge2 = new Edge(pointBid, pointAid, weight);
            vertecies[pointAid].addEdge(edge1);
            vertecies[pointBid].addEdge(edge2);
        }
    }

    public String getVertecies() {

        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : vertecies) {
            sb.append("ID: " + vertex.id + ", " + "Name: " + vertex.name + "\n");
        }
        return sb.toString();
    }


    private class Vertex {
        int id = VertexID;
        String name;
        ArrayList<Edge> listOfEdges = new ArrayList<>();
        boolean isVertexVisited = false;

        Vertex() {
            this.name = String.valueOf(this.id);
        }

        Vertex(String name) {
            this.name = name;
        }

        public void setVertexAsVisited() {
            this.isVertexVisited = true;
        }

        private void addEdge(Edge edge) {
            if (!listOfEdges.contains(edge)) {
                listOfEdges.add(edge);
            }
        }
    }

    private class Edge {

        Integer source;
        Integer destination;
        Integer weight;

        Edge(Integer source, Integer destination, Integer weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public void dijkstraShortestPathAlgorithm(Integer fromVertexID, Integer toVertexID) {

        Map<Integer, Integer[]> pathInfoList = new HashMap<>();

        List<Vertex> unvisitedVertex = new ArrayList<>();

        for (Vertex vertex : vertecies) {
            pathInfoList.put(vertex.id, new Integer[2]);
            unvisitedVertex.add(vertex);
        }

        Vertex searchedVertex = vertecies[fromVertexID];
        pathInfoList.get(fromVertexID)[0] = 0;
        pathInfoList.get(fromVertexID)[1] = null;

        while (!unvisitedVertex.isEmpty()) {

            Integer nearestUnvisitedNeighbourId = null;
            Integer nearestUnvisitedNeighbourWeight = null;

            for (Edge edge : searchedVertex.listOfEdges) {

                if (!vertecies[edge.destination].isVertexVisited) {

//                    w tym miejscu wybiera się następnego sąsiada, jest to wybór następnej najkrótszej drogi.
                    if (nearestUnvisitedNeighbourId == null || edge.weight < nearestUnvisitedNeighbourWeight) {
                        nearestUnvisitedNeighbourId = edge.destination;

                        nearestUnvisitedNeighbourWeight = edge.weight;
                    }

                    Integer previousDistance = pathInfoList.get(edge.destination)[0];
                    if (previousDistance == null) {

                        pathInfoList.get(edge.destination)[0] = edge.weight + pathInfoList.get(searchedVertex.id)[0];
                        pathInfoList.get(edge.destination)[1] = edge.source;
                    } else {

                        Integer currentDistance = edge.weight + pathInfoList.get(searchedVertex.id)[0];

                        if (previousDistance > currentDistance) {
                            pathInfoList.get(edge.destination)[0] = edge.weight + pathInfoList.get(searchedVertex.id)[0];
                            pathInfoList.get(edge.destination)[1] = edge.source;
                        }
                    }
                }
            }

            searchedVertex.setVertexAsVisited();
            unvisitedVertex.remove(searchedVertex);
            if (nearestUnvisitedNeighbourId != null) {
                searchedVertex = vertecies[nearestUnvisitedNeighbourId];
            }
        }
        System.out.println(Arrays.toString(pathInfoList.get(toVertexID)));
    }
}
