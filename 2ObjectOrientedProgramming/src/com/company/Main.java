package com.company;

import com.company.drive.HDDDrive;
import com.company.drive.SDDDrive;

public class Main {

    public static void main(String[] args) {

        // crtl + alt + V na new Garnek()


        Monitor monitor = new Monitor();
        HDDDrive drive = new HDDDrive();

        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("jnsp.jpg"));

        drive.listFiles();


    }
}
