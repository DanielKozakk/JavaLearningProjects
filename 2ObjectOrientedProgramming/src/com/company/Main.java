package com.company;

import com.company.drive.Drive;
import com.company.drive.HDDDrive;
import com.company.drive.SDDDrive;
import com.company.file.File;
import com.company.file.imagefile.GIFImageFile;
import com.company.file.imagefile.JPGImageFile;
import com.company.file.musicfile.MP3File;
import com.company.usbdevice.MemoryStick;
import com.company.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {

        // crtl + alt + V na new Garnek()


        Monitor monitor = new Monitor();
        Drive drive = new SDDDrive();

        Computer computer = new Computer(monitor, drive);

        GIFImageFile pierwszyGif = new GIFImageFile("pierwszyGif", 200);
        JPGImageFile pierwszJPG = new JPGImageFile("pierwszJPG", 20, 80);

        MP3File mp3File = new MP3File("pierwszyMP3", 4000, "Marlin Manson", "Broken Needle", 20);

        System.out.println(mp3File.getName());

        drive.addFile(pierwszJPG);
        drive.addFile(pierwszyGif);
        drive.addFile(mp3File);

        // 22:23:47

    }
}
