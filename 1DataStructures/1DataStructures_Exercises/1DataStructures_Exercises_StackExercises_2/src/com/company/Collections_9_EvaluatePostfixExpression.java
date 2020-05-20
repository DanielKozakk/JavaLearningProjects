package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class Collections_9_EvaluatePostfixExpression {

    private String expression;
    private int expressionLength;
    private List<String> operators = new ArrayList<>();

    Collections_9_EvaluatePostfixExpression (String postfixExpression){
        this.expression = postfixExpression;
        this.expressionLength = expression.length();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
    }

    String evaluateExpression(){

        //                  10 2 8 * + 3 -

        /*
                 NA PAPIERZE :

                Tworzę sobię listę operatorów matematycznych
                Tworzę sobie outputStack, który będzie zawierał napotkane znaki matematyczne

                Tworzę zmienną opisującą numerDoDodania

                Robię for loop, iterującą przez znaki w expression (ch)

                W środku robię instrukcję warunkową,

                    Jeśli dany znak jest operatorem

                        secondNumber = stack.pop();
                        firstNumber = stack.pop
                        outputNumber;

                        case na operatora, wykonuję operację, zapisuję wynik w outputNumber
                        dodaję outputNumber do Stacka

                    Jeśli dany znak jest spacją

                        Jeśli poprzedni nie należy do operatorów

                            outputStack.push (numerDoDodania)
                            kasuję numer do dodania
                        else
                            continue

                    W innym wypadku:
                        numer do dodania = numer do dodania + ch

                 End foor lop
                 Na koniec sprawzdam outputStack.sleek()

                 PSEUDOKOD:
                                  operators = new ArrayList();

                 inside function to evaluation:

                 outputStack = new Stack();
                 outputNumber = "";

                 for (i = 0; i < expresion.length; i++){

                    jeśli expression[i] jest w operatorach

                        secondNumber = stack.pop();
                        firstNumber = stack.pop();

                            case (expression[i])
                                *
                                stack.push(firstnumber * secondnumber)
                                etc ...
                      jeżeli expression [i] = " "

                        jeżeli expression [i-1] nie należy do operatorów
                            outputStack.push(numerDoDodania)
                            numerDododania="";
                        else
                            continue
                      else
                        numerDoDodania += ch


                       zwróć peek of stack.
                 }
         */

        Stack<String> outputStack = new Stack<>();
        String numberToAdd = "";

        for(int i = 0; i < expressionLength; i++){
            String ch = String.valueOf(expression.charAt(i));


            if(operators.contains(ch)){

                int secondNumber = Integer.parseInt(outputStack.pop());
                int firstNumber = Integer.parseInt(outputStack.pop());
                int thirdNumber = switch (ch) {
                    case "+" -> secondNumber + firstNumber;
                    case "-" -> firstNumber - secondNumber;
                    case "*" -> secondNumber * firstNumber;
                    case "/" -> firstNumber / secondNumber;
                    default -> 0;
                };

                outputStack.push(String.valueOf(thirdNumber));

            } else if (ch.equals(" ")){

                String previousCh = String.valueOf(expression.charAt(i - 1));

                if(!operators.contains(previousCh)){
                    outputStack.push(numberToAdd);
                    numberToAdd = "";

                } else {
                    continue;

                }

            } else {
                numberToAdd = numberToAdd + ch;
            }
        }

        return outputStack.peek();
    }







}
