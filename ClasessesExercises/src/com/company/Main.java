package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Articles> articlesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];

            Articles articles = new Articles(title, content, author);
            articlesList.add(articles);
        }
        String type = scanner.nextLine();

        switch (type) {
            case "title":
                articlesList.sort(Comparator.comparing(Articles::getTitle));
                break;

            case "content":
                articlesList.sort(Comparator.comparing(Articles::getContent));
                break;

            case "author":
                articlesList.sort(Comparator.comparing(Articles::getAuthor));
                break;

        }
        for (Articles articles : articlesList) {
            System.out.println(articles);
        }
    }
}
