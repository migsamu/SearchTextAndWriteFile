package org.iesfm.ejercicio6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        CreateNumberFile createNumberFile = new CreateNumberFile();
        int number = createNumberFile.getNumber();
        File file = createNumberFile.createFile(number);
        createNumberFile.writeFile(file, number);
    }

}
