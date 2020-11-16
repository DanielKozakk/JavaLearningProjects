package com.company.drive;

import com.company.file.File;

import java.util.*;

public class HDDDrive implements Drive {

    List<File> hddFiles = new ArrayList<>();

    @Override
    public void addFile(File file) {
        hddFiles.add(file);
    }

    @Override
    public void listFiles() {

        for(File file : hddFiles){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {

        Optional<File> foundFile = hddFiles.stream().filter(file -> file.getName().equals(name)).findFirst();
        return foundFile.orElseThrow();
    }

    public List<File> getHddFiles() {
        return hddFiles;
    }
}
