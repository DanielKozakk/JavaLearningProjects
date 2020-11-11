package com;


import com.jaknauczycsieprogramowania.project.file.imagefile.GIFImageFile;
import com.valueAndReferencePassing.Simson;

public class Main {

    public static void main(String[] args) {

        Simson simson = new Simson();
        System.out.println(simson.name);
        transformIntoHomer(simson);
        System.out.println(simson.name);


    }

    static void transformIntoHomer(Simson simson){
        simson.name = "Homer";
    }




}
