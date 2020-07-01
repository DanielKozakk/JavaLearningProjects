package com.company;

import java.util.Stack;

public class Collections_10_SortAStackUsingTemporaryStack {

    public void sort(Stack<Integer> inputStack){


        /*
        [34, 3, 31, 98, 92, 23]



        jeden stakc musi być desc a drugi adesc


        element = inputStack.pop();

        if(outputStack.empty || outputStack.peek < element ){
            outputStack.push(element)

            // outputStack :
            // po pierwszej iteracji [23]
            // po drugiej iteracji [23, 92]
            // po trzeciej iteracji [23, 92, 98]

        } else {
            // po czwartej element = 31
            outputStack  [23, 92, 98]

            while(outputStack.peek > element){

                tmpStack.push(outputStack.pop) // tmpStack [98, 92]
                // outputStack [23]
            }

            tmpStack.push(element) // tmpStack [98,92,32]

            while(!outputStack.isEmpty){
                tmpStack.push(outputStack,pop)   // tmp stack [98,92,32,23]
            }

            while(!tmpStack.isEmpty){
                 outputStack.push(tmpStack,pop)
            }

        }

         */
        Stack<Integer> outputStack = new Stack<>();
        Stack<Integer> tmpStack = new Stack<>();

        while(!inputStack.empty()){

            Integer newElement = inputStack.pop();
            if(outputStack.empty() || outputStack.peek() < newElement){
                outputStack.push(newElement);

            } else {
                while(!outputStack.empty() && outputStack.peek() > newElement){
                    tmpStack.push(outputStack.pop());
                }
                tmpStack.push(newElement);
                while(!outputStack.empty()){
                    tmpStack.push(outputStack.pop());
                }
                while(!tmpStack.empty()){
                    outputStack.push(tmpStack.pop());
                }
            }
        }
        System.out.println(outputStack);
    }

}
