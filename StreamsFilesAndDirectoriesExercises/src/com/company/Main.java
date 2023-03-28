package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        for (String line : allLines) {
            int sum = 0;

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                sum += currentChar;
            }
            System.out.println(sum);
        }

    }
}
