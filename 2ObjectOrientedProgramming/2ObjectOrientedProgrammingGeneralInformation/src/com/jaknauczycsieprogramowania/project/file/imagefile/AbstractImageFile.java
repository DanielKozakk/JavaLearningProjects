package com.jaknauczycsieprogramowania.project.file.imagefile;

import com.jaknauczycsieprogramowania.project.file.AbstractFile;
import com.jaknauczycsieprogramowania.project.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name,size);
    }

    protected void utnij(){

        System.out.println("tne okrutnie");

    }
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
