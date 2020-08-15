package com.company;

import java.util.Stack;

public class Collections_10_v2_SortStackUsingTemporaryStack {

    public void sort(Stack<Integer> inputStack) {

        /*
            Input : [34, 3, 31, 98, 92, 23]
            Output : [3, 23, 31, 34, 92, 98]


            while(!input.isEmpty)
                Jeśli outputStack jest pusty albo jeśli jeśli input.peek >= outputStack.peek

                    outputStack.add(input.pop)

                else
                  searchedElement = input.pop()

                  while(!outputStack.isEmpty() && searchedElement < outputStack.peek())

                    inputStack.push(outputStack.pop())


                  outputStack.push(searchedElement)
         */

        Stack<Integer> outputStack = new Stack<>();
        while (!inputStack.empty()){

            if(outputStack.isEmpty() || inputStack.peek() >= outputStack.peek()){

                outputStack.push(inputStack.pop());

            } else {
                Integer searchedElement = inputStack.pop();

                while(!outputStack.isEmpty() && searchedElement < outputStack.peek()){
                    inputStack.push(outputStack.pop());
                }
                outputStack.push(searchedElement);
            }

        }

        System.out.println(outputStack.toString());
    }
}
