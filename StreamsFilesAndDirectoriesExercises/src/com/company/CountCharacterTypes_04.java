package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLine = Files.readAllLines(Path.of(pathIn));

        int volewsCount = 0;
        int punctCount = 0;
        int consonantsCount = 0;

        Set<Character> vowels = getVolews();
        Set<Character> marks = getPuntMarks();

        for (String line : allLine) {

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);

                if (currentChar == ' ') {
                    continue;
                }

                if (vowels.contains(currentChar)) {
                    volewsCount++;
                } else if (marks.contains(currentChar)) {
                    punctCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("igor.txt"));

        writer.write("Vowels: " + volewsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();

    }

    private static Set<Character> getPuntMarks() {
        Set<Character> getPuntMarks = new HashSet<>();
        getPuntMarks.add('!');
        getPuntMarks.add('.');
        getPuntMarks.add(',');
        getPuntMarks.add('?');
        return getPuntMarks;
    }

    private static Set<Character> getVolews() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
