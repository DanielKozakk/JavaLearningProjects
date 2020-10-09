package com.company.serie1;

import java.util.*;

public class Collections_36_FindSymmetricPairsInAnArray {

    public void findSymmetricPairs(int[][] arrays) {


        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int[] innerArray : arrays) {
            hm.put(innerArray[0], innerArray[1]);
        }

        Set<Integer[]> listOfSymmetric = new HashSet<>();
        for (Integer key : hm.keySet()) {

            Integer value = hm.get(key); // 40
            if (hm.containsValue(key) && hm.containsKey(value)) {
                Integer[] symmetricPair = new Integer[]{key, value};
                listOfSymmetric.add(symmetricPair);
            }

        }

        for(Integer[] symmetricArray : listOfSymmetric){

            System.out.println(Arrays.toString(symmetricArray));

        }
    }

}
