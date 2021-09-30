package org.iesfm.ejercicio6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Scanner;

public class CreateNumberFile {

    private static final Logger log = LoggerFactory.getLogger(CreateNumberFile.class);
    private static Scanner scan = new Scanner(System.in);

    public int getNumber() {
        log.info("Introduce un número...");
        int number = scan.nextInt();
        scan.nextLine();

        return number;
    }

    public File createFile(int number) {
        return new File("/tmp/" + number + ".txt");
    }

    public void writeFile(File file, int number){
        
    }
}
