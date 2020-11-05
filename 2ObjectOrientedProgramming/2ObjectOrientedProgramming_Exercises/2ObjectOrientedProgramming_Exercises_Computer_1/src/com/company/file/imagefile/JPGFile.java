package com.company.file.imagefile;

public class JPGFile extends AbstractImageFile {




    private final int compression;

    public JPGFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    @Override
    void displayImage() {
        System.out.println("Display JPG File");

    }
}
