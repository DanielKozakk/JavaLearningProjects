package com.company.pokryciezbioru;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PokrycieZbioru {

    Set<String> statesNeeded;
    HashMap<String, Set<String>> stationsAndStatesHashMap;
    Set<String> finalChosenStations;

    public PokrycieZbioru() {
        this.finalChosenStations = new HashSet<>();
        this.statesNeeded = new HashSet<>();
        this.stationsAndStatesHashMap = new HashMap<String, Set<String>>();

        statesNeeded.add("mt");
        statesNeeded.add("wa");
        statesNeeded.add("or");
        statesNeeded.add("id");
        statesNeeded.add("nv");
        statesNeeded.add("ut");
        statesNeeded.add("ca");
        statesNeeded.add("az");


        Set<String> firstSet = new HashSet<>();
        firstSet.add("id");
        firstSet.add("nv");
        firstSet.add("ut");
        stationsAndStatesHashMap.put("kone", firstSet);

        Set<String> secondSet = new HashSet<>();
        secondSet.add("wa");
        secondSet.add("id");
        secondSet.add("mt");
        stationsAndStatesHashMap.put("ktwo", secondSet);

        Set<String> thirdSet = new HashSet<>();
        thirdSet.add("or");
        thirdSet.add("nv");
        thirdSet.add("ca");
        stationsAndStatesHashMap.put("kthree", thirdSet);

        Set<String> forthSet = new HashSet<>();
        forthSet.add("nv");
        forthSet.add("ut");
        stationsAndStatesHashMap.put("kfour", forthSet);

        Set<String> fifthSet = new HashSet<>();
        fifthSet.add("ca");
        fifthSet.add("az");
        stationsAndStatesHashMap.put("kfive", fifthSet);
    }

    public void checkCoverage() {
        while (!statesNeeded.isEmpty()) {
            String bestStation =null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> element : stationsAndStatesHashMap.entrySet()) {
                String station = element.getKey();
                Set<String> states = element.getValue();

                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(states);

                if(covered.size() > statesCovered.size()){
                    bestStation = station;
                    statesCovered = covered;
                }
            }
            statesNeeded.removeAll(statesCovered);
            finalChosenStations.add(bestStation);
        }

        System.out.println(finalChosenStations.size());
        finalChosenStations.forEach(System.out::println);

        /**
         *
         * 1. tworzę listę statnów, których jeszcze potrzebuję - statesNeeded.
         * 2. Tworzę mapę - <nazwa stacji, lista stanów stacji> - stationsAndStatesHashMap
         * 3. Robię pętlę while, która działa, dopóki statesNeeded nie zostanie opróżnione
         * 4. Wewnątrz pętli while robię zmienną best_station
         * 5. wewnątrz pętli while robię drugią zmienną - states_covered, będzie ona oznaczała stany, które stacja pokrywa, które nie zostaly jeszcze pokryte
         *
         * 6. robię wewnętrzną pętlę loop, która iteruje się po stationsAndStatesHashMap - czyli ma key: station value: set of states
         - czyli po wszystkich dostępnych stacjach
         *
         * 7. Wewnątrz tej pętli robię zmienną covered, która bierze set statesNeeded i set of states z iteracji wewnętrznej pętli.
         * 8. Jeśli długość covered jest większa od długości states_covered, to best station to obecnie iterowana stacja, a states_covered to covered
         *
         */

    }
}
