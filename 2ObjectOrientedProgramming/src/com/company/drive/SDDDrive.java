package com.company.drive;

import com.company.file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SDDDrive implements Drive {
    private Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFiles() {

        Collection<File> values = files.values();
        for(File file : values){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }
}
