package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collections_14_GenerateBinaryNumbersFrom1ToNUsingQueue {

    public void generate(int n){


        /*
          Input: n = 2
          Output: 1, 10

        Input: n = 5
        Output: 1, 10, 11, 100, 101


        arrayList = new ArrayList () ;
        creationQueue = new LinkedList;

        for(i = 0, i < n ; i ++) {

        }

        if(creationQueue.size < 3 ) {

            createNumberAndAddToQueueAndAdd(creationQueue.peek, creationQueue)

        }

        function createNumberAndAddToQueue(baseNumber, queue){
        createdFirstNumder = baseNumber + "0"
        createdSecondNumder = baseNumber + "1"

        queue.add(baseNumber)
        queue.add(createdFirstNumder);
        queue.add(createdSecondNumder);



        __________________________________________________________________________________________________________________


        createNumberAndAddToQueue("1");

        for(i = 0, i < n ; i ++) {

            if(creationQueue.size < 3 ) {
                createNumberAndAddToQueue(creationQueue.peek, creationQueue)
            }

            arrayList.add(creationQueue.poll());
        }

        }
        }


         */
        List<String> oututArrayList = new ArrayList<>();
        Queue<String> creationQueue = new LinkedList<>();

        createNumberAndAddToQueue("1", creationQueue);

        for(int i = 0; i < n ; i++){
            if(creationQueue.size() < 3){
                createNumberAndAddToQueue(creationQueue.peek(), creationQueue);
            }
            oututArrayList.add(creationQueue.poll());

        }

        System.out.println(oututArrayList);
    }

    private void createNumberAndAddToQueue(String number, Queue<String> creationQueue){
     StringBuilder sb1 = new StringBuilder(number);
     StringBuilder sb2 = new StringBuilder(number);

     sb1.append("0");
     sb2.append("1");

     creationQueue.add(number);
     creationQueue.add(sb1.toString());
     creationQueue.add(sb2.toString());

    }

}
