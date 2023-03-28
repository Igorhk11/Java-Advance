package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        Map<String,Integer> wordCountMap = new LinkedHashMap<>();
        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathIn));

        for (String line : allLinesWithWords) {
            Arrays.stream(line.split("\\s+")).forEach(word -> wordCountMap.put(word, 0));
        }

        String path = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        for (String line : allLines) {

            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (wordCountMap.containsKey(word)) {
                    int value = wordCountMap.get(word);
                    wordCountMap.put(word, value + 1);
                }
            });
        }

        PrintWriter writer = new PrintWriter("results.txt");

        wordCountMap.entrySet().stream().sorted((e1, e2) ->
            e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        writer.flush();



    }
}
