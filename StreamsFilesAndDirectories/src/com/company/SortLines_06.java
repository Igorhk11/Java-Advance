package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\input.txt";
        String pathOut = "C:\\Users\\Hadji\\Desktop\\06.SortLinesOutput.txt";

        Path input = Paths.get(pathIn);
        Path output = Paths.get(pathOut);

        List<String> orderedDocument = Files.readAllLines(input);
        Collections.sort(orderedDocument);
        Files.write(output, orderedDocument);

    }
}
