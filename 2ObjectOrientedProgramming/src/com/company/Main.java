package com.company;

import com.company.drive.HDDDrive;
import com.company.drive.SDDDrive;
import com.company.usbdevice.MemoryStick;
import com.company.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {

        // crtl + alt + V na new Garnek()


        Monitor monitor = new Monitor();
        HDDDrive drive = new HDDDrive();

        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("jnsp.jpg"));
//
//        drive.listFiles();

        MemoryStick pendrive = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mouse");

        computer.addUSBDevice(pendrive);
//        computer.addUSBDevice(mouse);

        pendrive.eject();
        computer.removeUSBDevice(pendrive);
//        computer.removeUSBDevice(mouse);
    }
}
