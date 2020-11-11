package com.company.problempudelka;

import java.util.ArrayList;

public class Box implements Item {

    public int boxID;
    public static int id = 0;

    public Box() {
        this.boxID = id;
        id++;
    }

    public ArrayList<Item> itemsArrayList = new ArrayList<>();

    public void addToBox(Item item) {
        itemsArrayList.add(item);
    }

    public ArrayList<Item> open() {
        return itemsArrayList;
    }

    @Override
    public ItemType getType() {
        return ItemType.BOX;
    }

    public void lookForKey(Item item){
        if(item instanceof Box){
            System.out.println("Przeszukuję boxa o id " + ((Box) item).boxID);
            for(Item itemInsideBox : ((Box) item).itemsArrayList ){
                lookForKey(itemInsideBox);
            }
        } else {
            System.out.println("Znalazłem klucz !!!");
        }
    }
}
