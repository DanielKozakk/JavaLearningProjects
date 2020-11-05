package com.company;

import com.company.devices.Monitor;
import com.company.drive.Drive;
import com.company.drive.HDDDrive;
import com.company.usb.Mouse;
import com.company.usb.Pendrive;

public class Main {

    public static void main(String[] args) {

        Drive drive = new HDDDrive();
        Computer computer = new Computer(new Monitor(), drive);


//        drive.addFile(new GIFFile("jnsp.jpg", 20));
//        drive.listFiles();

        Pendrive pendrive = new Pendrive("Pendrive");
        Mouse mouse = new Mouse("Myszka");

        computer.addUSBDevice(pendrive);
//        computer.addUSBDevice(mouse);
//        pendrive.eject();
        computer.removeUSBDevice(pendrive);
//        computer.removeUSBDevice(mouse);

    }
}

