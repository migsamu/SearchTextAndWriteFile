package org.iesfm.ejercicio7;

import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();
        File originFile = fileUtils.getFile();
        File finalFile = fileUtils.getFile();
        HashMap<String, Integer> map = fileUtils.countWords(originFile);

        fileUtils.writeFile(map, finalFile);
    }
}
