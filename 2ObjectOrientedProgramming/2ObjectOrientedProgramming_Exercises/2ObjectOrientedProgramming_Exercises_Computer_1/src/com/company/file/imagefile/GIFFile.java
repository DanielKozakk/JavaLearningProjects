package com.company.file.imagefile;

public class GIFFile extends AbstractImageFile {


    public GIFFile(String name, int size) {
        super(name, size);
    }

    @Override
    void displayImage() {
        System.out.println("Display GIF file");
    }
}