package com.company.file.musicfile;

public class MP3File extends AbstractMusicFile {

    public int getQuality() {
        return quality;
    }

    private int quality;
    protected MP3File(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }
    @Override
    public void play() {
        System.out.println("Playing mp3");
    }
}
