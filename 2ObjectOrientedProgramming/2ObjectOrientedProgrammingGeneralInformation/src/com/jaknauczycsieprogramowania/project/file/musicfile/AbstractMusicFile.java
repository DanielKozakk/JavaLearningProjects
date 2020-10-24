package com.jaknauczycsieprogramowania.project.file.musicfile;

import com.jaknauczycsieprogramowania.project.file.AbstractFile;
import com.jaknauczycsieprogramowania.project.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{

    protected String bandtitle;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandtitle, String title) {
        super(name,size);
        this.bandtitle = bandtitle;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
