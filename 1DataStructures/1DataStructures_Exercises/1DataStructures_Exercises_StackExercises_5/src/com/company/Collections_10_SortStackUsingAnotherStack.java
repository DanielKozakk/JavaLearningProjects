package com.company;

import java.util.Stack;

public class Collections_10_SortStackUsingAnotherStack {
//Input : [34, 3, 31, 98, 92, 23] Output : [3, 23, 31, 34, 92, 98] Input : [3, 5, 1, 4, 2, 8] Output : [1, 2, 3, 4, 5, 8]


    /*
            tmpStack push peek of input

            iteruje się przez elementy stacka

                jeśli inputPeek jest większy lub równy od tmpStack

                    tmpstack.push(input.pop))

                jeśli inputPeekjest mniejszy    od searchedElement

                    robię tutaj pętlę, która będzie wyciągać elementy z tmp i wrzucać je do inputStack aż wreszcie searched element będzie większy od tmpStack.peek lub
                    tmp stack bedzie pusty

                    następnie dodaję searchedElement do inputPeek
     */

    public void sort(Stack<Integer> inputStack) {

        Stack<Integer> tmpStack = new Stack<>();



//Input : [34, 3, 31, 98, 92, 23]

        while (!inputStack.isEmpty()) {
            Integer searchedElement = inputStack.pop();


            if (tmpStack.isEmpty() || searchedElement >= tmpStack.peek()) {

                tmpStack.push(searchedElement);
            } else {



                while ( !tmpStack.isEmpty() && searchedElement < tmpStack.peek()) {

                    inputStack.push(tmpStack.pop());

                }

                tmpStack.push(searchedElement);

            }

        }

        System.out.println(tmpStack.toString());
    }


}
