package com.company;

import java.io.*;

public class ALLCAPITALS_03 {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        BufferedReader reader = new BufferedReader(new FileReader(pathIn));

        String line = reader.readLine();
        while (line != null) {
            writer.write(line.toUpperCase());
            writer.newLine();

            line = reader.readLine();
        }
        writer.close();


    }
}
