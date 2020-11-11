package com.company;

import com.company.problempudelka.Box;
import com.company.problempudelka.Item;
import com.company.problempudelka.Key;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Box mainBox = new Box();

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();


        box1.addToBox(new Box());
        box1.addToBox(new Box());
        box1.addToBox(new Box());
        box1.addToBox(new Box());

        box2.addToBox(new Box());

        var luckyBox = new Box();
        luckyBox.addToBox(new Key());
        box4.addToBox(luckyBox);

        mainBox.addToBox(box1);
        mainBox.addToBox(box2);
        mainBox.addToBox(box3);
        mainBox.addToBox(box4);


        Stack<Box> stosPudelek = new Stack<>();
        stosPudelek.add(mainBox);

        mainBox.lookForKey(mainBox);

//        while(!stosPudelek.isEmpty()){
//            Box searched = stosPudelek.pop();
//
//            System.out.println("Przeszukuję pudełko o id : "  + searched.boxID);
//
//            for(Item item : searched.itemsArrayList){
//                if(item instanceof Box){
//                    stosPudelek.add((Box) item);
//                } else {
//                    System.out.println("znalazłem klucz!");
//                    break;
//                }
//            }
//        }



    }
}
