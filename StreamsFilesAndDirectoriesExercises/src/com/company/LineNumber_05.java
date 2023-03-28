package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class LineNumber_05 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> allLine = Files.readAllLines(Path.of(pathIn));

        int counter = 1;
        PrintWriter writer = new PrintWriter("output_file_igor.txt");
        for (String line : allLine) {
            writer.printf("%d. %s%n", counter, line);
            counter++;
        }
        writer.close();

    }
}
