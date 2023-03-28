package com.company;

import java.io.File;
import java.nio.file.Path;

public class GetFolderSize_08 {
    public static void main(String[] args) {


        String path = "C:\\Users\\Hadji\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        File folder = new File(path);
        File[] allfiles = folder.listFiles();

        int folderSize = 0;
        for (File file : allfiles) {
            folderSize += file.length();
        }
        System.out.println("Folder size: "+ folderSize);
    }
}
