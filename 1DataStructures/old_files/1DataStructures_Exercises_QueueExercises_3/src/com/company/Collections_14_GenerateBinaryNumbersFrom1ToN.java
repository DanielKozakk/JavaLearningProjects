package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_14_GenerateBinaryNumbersFrom1ToN {

    public void generate(int n) {


        /*

            helperQueue robię
            main_number = 1
            helperQueue.add(main_number)

            for(int i = 0 ; i < n; i ++)


                od tego numeru robię second = main_number + "0"
                od tego numeru robię third = main_number + "1"

                dodaję dwa numery do helperQueue

                main_number = second;

                System.out.println(helperQueue.pop)

         */
        Queue<String> helperQueue = new LinkedList<>();
        String mainNumber = "1";
        helperQueue.add(mainNumber);

        for (int i = 0; i < n; i++) {
            String second = mainNumber + "0";
            String third = mainNumber + "1";
            helperQueue.add(second);
            helperQueue.add(third);

            mainNumber = second;
            System.out.println(helperQueue.poll());

        }

    }

}
