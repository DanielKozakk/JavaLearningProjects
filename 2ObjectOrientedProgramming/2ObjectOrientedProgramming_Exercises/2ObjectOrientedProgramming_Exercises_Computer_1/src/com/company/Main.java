package com.company;

import com.company.devices.Monitor;
import com.company.drive.Drive;
import com.company.drive.HDDDrive;
import com.company.file.imagefile.GIFFile;
import com.company.file.imagefile.JPGFile;
import com.company.file.musicfile.MP3File;
import com.company.usb.Mouse;
import com.company.usb.Pendrive;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Drive drive = new HDDDrive();
        Computer computer = new Computer(new Monitor(), drive);

        MP3File mp3file = new MP3File("Name", 2, "Marlin Manson", "Broken Needle", 100);
        JPGFile pierwszyJpg = new JPGFile("pierwszy jpg", 20, 4);
        GIFFile pierwszyGif = new GIFFile("pierwszy gif", 20);


        drive.addFile(mp3file);
        drive.addFile(pierwszyGif);
        drive.addFile(pierwszyJpg);

        HashMap<Integer, Computer> hm = new HashMap<>();

        hm.put(0, computer);

        System.out.println(hm.get(0).flag);
        computer.flag = 2;
        System.out.println(hm.get(0).flag);

//        hm.get(0).getDrive().listFiles();

//        GIFFile drugiGif = new GIFFile("drugi gif", 20);
//        computer.getDrive().addFile(drugiGif);

//        hm.get(0).getDrive().listFiles();

//        Integer liczba = 0;
//        HashMap<Integer, Integer> hm = new HashMap<>();
//
//        hm.put(0, liczba);
//
//        System.out.println(hm.get(0));
//        liczba ++;
//        System.out.println(hm.get(0));


    }
}

