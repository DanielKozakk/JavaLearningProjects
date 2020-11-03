package com.company;

public class Pierwsza{
    Integer id;
    Pierwsza(int id){

        this.id = id;
    }

    public void changeId (){
        this.id = 2;
    }
    public int getId(){
        return this.id;
    }
}
