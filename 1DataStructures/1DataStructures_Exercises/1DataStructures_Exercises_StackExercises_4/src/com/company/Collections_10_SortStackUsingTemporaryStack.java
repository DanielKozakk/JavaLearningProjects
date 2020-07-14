package com.company;

import java.util.Stack;

public class Collections_10_SortStackUsingTemporaryStack {

    //        Given a stack of integers, sort it in ascending order using another temporary stack.

//        Input : [34, 3, 31, 98, 92, 23] Output : [3, 23, 31, 34, 92, 98] Input : [3, 5, 1, 4, 2, 8] Output : [1, 2, 3, 4, 5, 8]

    public void sortingStack (Stack<Integer> inputStack){

        /*



                while(!inputStack.isEmpty)

                    if(tmpStack.isEmpty || tmpStack.peek < inputStack,peek)

                        tmpStack.push(inputStack.pop)

                    else if tmpStack.peek > inputStack.peek

                        tmp = inputStack.peek

                        while(tmpStack.isEmpty)

                            inputStack.push(tmpStack.pop)

                        tmpStack.push(tmp)
         */

        Stack<Integer> tmpStack = new Stack();
        while(!inputStack.isEmpty()){

            if(tmpStack.isEmpty() || tmpStack.peek() < inputStack.peek()){
                tmpStack.push(inputStack.pop());

            } else if(tmpStack.peek() > inputStack.peek()){
                Integer tmp = inputStack.peek();
                inputStack.pop();
                while(!tmpStack.isEmpty()){
                    inputStack.push(tmpStack.pop());
                }
                tmpStack.push(tmp);
            }
        }

        System.out.println(tmpStack.toString());

    }


}
