package com.company.file.musicfile;

import com.company.file.AbstractFile;
import com.company.file.FileType;

public class AbstractMusicFile extends AbstractFile implements MusicFile {

    protected AbstractMusicFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getFileType() {
        return FileType.MUSIC;
    }

    @Override
    public void play() {

    }
}
