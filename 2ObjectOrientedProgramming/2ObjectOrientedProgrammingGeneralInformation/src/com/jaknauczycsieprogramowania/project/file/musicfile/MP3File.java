package com.jaknauczycsieprogramowania.project.file.musicfile;

public class MP3File extends AbstractMusicFile {

     private int quality;

    public MP3File(String name, int size, String bandtitle, String title, int quality) {
        super(name, size, bandtitle, title);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    @Override
    public String getName() {
        return "Plik nazywa się MP3 " + super.getName();
    }
}
