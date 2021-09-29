package org.iesfm.ejercicio5;

import java.io.File;

public class Main {


    public static void main(String[] args) {

        FileFolderReader fileFolderReader = new FileFolderReader();
        File originFile = fileFolderReader.getFile();
        String text = fileFolderReader.getText();
        File finalFile = fileFolderReader.getFile();



    }
}
