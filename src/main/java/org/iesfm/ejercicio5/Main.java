package org.iesfm.ejercicio5;

import java.io.File;

public class Main {


    public static void main(String[] args) {

        FileReaderAndWriter fileReaderAndWriter = new FileReaderAndWriter();
        File originFile = fileReaderAndWriter.getFile();
        String text = fileReaderAndWriter.getText();
        File finalFile = fileReaderAndWriter.getFile();
        int count = fileReaderAndWriter.countText(originFile, text);
        fileReaderAndWriter.writeFile(finalFile, count);


    }
}
