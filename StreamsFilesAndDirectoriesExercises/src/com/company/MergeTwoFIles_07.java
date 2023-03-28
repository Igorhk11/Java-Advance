package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFIles_07 {
    public static void main(String[] args) throws IOException {

        String pathFirst = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathSecond = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputMerge.txt");
        List<String> fileOne = Files.readAllLines(Path.of(pathFirst));
        for (String file : fileOne) {
            writer.println(file);
        }
        List<String> fileTwo = Files.readAllLines(Path.of(pathSecond));
        for (String file : fileTwo) {
            writer.println(file);
        }

        writer.flush();
    }
}
