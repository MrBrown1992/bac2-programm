package at.fh.bac;

import java.io.File;

public class OwlFile {

    File file;

    public OwlFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public OwlFile() {
    }
}
