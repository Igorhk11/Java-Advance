package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WriteFile_0 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\input.txt";
        String pathOut = "C:\\Users\\Hadji\\Desktop\\IGOR.txt";

        Set<Character> forbiddenSymbols = new HashSet<>();
        Collections.addAll(forbiddenSymbols, '.', ',', '!', '?');

        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0) {
            char myByteAsChar = (char) oneByte;
            if (!forbiddenSymbols.contains(myByteAsChar)) {
                out.write(oneByte);
            }
            oneByte = in.read();
        }
    }
}
