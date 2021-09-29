package org.iesfm.ejercicio5;

import com.sun.source.tree.IfTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Scanner;

public class FileFolderReader {

    private static final Logger log = LoggerFactory.getLogger(FileFolderReader.class);
    private static final Scanner scan = new Scanner(System.in);

    public File getFile() {
        log.info("Introduce el directorio del archivo...");
        String file = scan.nextLine();

        return new File(file);
    }

    public String getText() {
        log.info("Introduce el texto que quiere buscar...");
        String text = scan.nextLine();

        return text;
    }

    public int countText(File file, String text) {

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(text)) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public void writeFile(File finalFile, int count){

        try {
            FileWriter writer = new FileWriter(finalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
