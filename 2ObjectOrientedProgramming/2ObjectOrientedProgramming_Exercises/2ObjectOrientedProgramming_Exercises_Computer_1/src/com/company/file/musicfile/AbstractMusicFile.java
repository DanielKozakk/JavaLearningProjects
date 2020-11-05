package com.company.file.musicfile;

import com.company.file.AbstractFile;
import com.company.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {


    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }


    @Override
    public FileType getFileType() {
        return FileType.MUSIC;
    }

}
