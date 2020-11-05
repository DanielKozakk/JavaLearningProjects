package com.company.drive;

import com.company.file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {

    Map<String, File> ssdFiles = new HashMap<>();

    @Override
    public void addFile(File file) {

    }

    @Override
    public void listFiles() {
        Collection<File> fileCollection = ssdFiles.values();
        for(File file : fileCollection){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return ssdFiles.get(name);
    }
}
