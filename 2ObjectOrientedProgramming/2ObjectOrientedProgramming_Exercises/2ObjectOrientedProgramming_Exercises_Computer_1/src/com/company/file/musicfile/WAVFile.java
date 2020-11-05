package com.company.file.musicfile;

public class WAVFile  extends AbstractMusicFile{

    protected WAVFile(String name, int size, String bandName, String title) {
        super(name, size, bandName, title);
    }

    @Override
    public void play() {
        System.out.println("Playing wave");
    }
}
