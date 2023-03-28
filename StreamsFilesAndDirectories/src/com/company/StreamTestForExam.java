package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StreamTestForExam {
    public static void main(String[] args) throws FileNotFoundException {


        String path = "C:\\Users\\Hadji\\Desktop\\input.txt";
        FileInputStream in = new FileInputStream(path);


        try {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s " ,Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }

        } catch (
                Exception e) {
            System.out.println("exception");
        }



    }
}
