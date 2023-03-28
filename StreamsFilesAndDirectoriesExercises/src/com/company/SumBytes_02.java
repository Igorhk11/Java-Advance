package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader br = new BufferedReader(new FileReader((path)));
        String line = br.readLine();
        long sum = 0;

        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                sum += currentChar;
            }

            line = br.readLine();
        }
        System.out.println(sum);

    }
}
