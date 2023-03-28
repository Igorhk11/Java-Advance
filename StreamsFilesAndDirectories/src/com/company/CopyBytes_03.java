package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String pathIn = "C:\\Users\\Hadji\\Desktop\\input.txt";
        String pathOut = "C:\\Users\\Hadji\\Desktop\\03.CopyBytesOutput.txt";


        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0) {
            char myByteAsChar = (char) oneByte;
            if (oneByte == 32 || oneByte == 10) {
                out.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
            oneByte = in.read();
        }
    }
}

