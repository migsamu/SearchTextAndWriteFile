package org.iesfm.ejercicio7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ContarPalabrasTexto {
    private static Logger log = LoggerFactory.getLogger(ContarPalabrasTexto.class);
    private static Scanner scan = new Scanner(System.in);

    public File getFile() {
        log.info("Introduce el directorio del archivo...");
        String filePath = scan.nextLine();

        return new File(filePath);
    }

    public HashMap contadorPalabras (File file) {
        int contador = 1;
        HashMap<String, Integer> mapaPalabras = new HashMap();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                  String[] palabras = line.split(" ");
                for (String palabra : palabras) {
                    if (mapaPalabras.containsKey(palabra)) {

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
