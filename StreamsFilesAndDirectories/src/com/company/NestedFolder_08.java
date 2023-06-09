package com.company;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolder_08 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Hadji\\Desktop\\Files-and-Streams");

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(file);

        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles)
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");

    }
}
