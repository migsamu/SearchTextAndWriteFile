package org.iesfm.ejercicio7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class FileUtils {
    private static Logger log = LoggerFactory.getLogger(FileUtils.class);
    private static Scanner scan = new Scanner(System.in);

    public File getFile() {
        log.info("Introduce el directorio del archivo...");
        String filePath = scan.nextLine();

        return new File(filePath);
    }

    public HashMap<String, Integer> countWords(File file) {
        HashMap<String, Integer> wordsMap = new HashMap();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!wordsMap.containsKey(word)) {
                        wordsMap.put(word, 1);
                    } else {
                        wordsMap.put(word, wordsMap.get(word) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsMap;
    }

    public void writeFile(HashMap<String, Integer> words, File file) {

        try (FileWriter writer = new FileWriter(file)) {
            for (String word : words.keySet()) {
                writer.write(word + " " + words.get(word) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
