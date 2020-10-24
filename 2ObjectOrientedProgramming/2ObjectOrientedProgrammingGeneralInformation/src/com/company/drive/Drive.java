package com.company.drive;

import com.company.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles ();
    File findFile(String name);
}
