package com.company.file.imagefile;

import com.company.file.AbstractFile;
import com.company.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name,size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
