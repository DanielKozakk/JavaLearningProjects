package com.company.serie2;

import com.company.AdjacencyListDirectedRawGraph;

public class Collections_23_CheckIfGraphIsATreeOrNot extends AdjacencyListDirectedRawGraph {



    public Collections_23_CheckIfGraphIsATreeOrNot(int graphSize) {
        super(graphSize);
    }



    public boolean checkIfGraphIsATree(){



        /*


                1. Graph nie jest tree, jeśli jakiś node ma więcej niż jedno połączenie z wyższym poziomem.
                2. Graph nie jest tree, jeśli jakiś node ma połączenia z sibblings.


                Robię queue do sprawdzania
                searched vertex = pierwszy

                Robiośe HashMapę<Integer, integer> (id vertexu, poziom)

                dodaję vertexdo queue
                do hashMapy dodaję vertexId, 0

                int level = 0;

                pętlą, która działa dopóki queue nie jset puste

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



                Teraz iteruję się przez hashmapę, iteruje przez id

                    Robię wewnętrzną pętlę, też przez id

                        sprawdzam

                JAK DO TEJ PORY 18 MINUT 25 SEKUND

         */



    }
}
