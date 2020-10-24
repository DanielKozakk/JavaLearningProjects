package com.jaknauczycsieprogramowania.project.drive;

import com.jaknauczycsieprogramowania.project.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles ();
    File findFile(String name);
}
