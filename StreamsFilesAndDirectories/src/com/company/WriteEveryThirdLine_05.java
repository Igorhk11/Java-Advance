package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws FileNotFoundException {

        String pathIn = "C:\\Users\\Hadji\\Desktop\\input.txt";
        String pathOut = "C:\\Users\\Hadji\\Desktop\\05.WriteEveryThirdLineOutput.txt";

        Scanner in = new Scanner(new FileInputStream(pathIn));
        PrintWriter out = new PrintWriter(new FileOutputStream(pathOut));

        int counter = 1;
        String line = in.nextLine();

        while (in.hasNextLine()) {
            if (counter % 3 == 0) {
                out.println(line);
            }
            counter++;
            line = in.nextLine();
            out.flush();
        }
        out.close();
        in.close();
    }
}
