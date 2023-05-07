package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(1);
        System.out.println("---------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task title:");
        String title = scanner.nextLine();
        System.out.println(title);

        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        System.out.println(description);

        System.out.println("Enter task estimation in hours:");
        int estimation = scanner.nextInt();
        System.out.println(estimation);

        System.out.println("Select author ID to assign");

        Author proAuthor = new Author(1, "ProAuthor", "proauthor@codecool.com");
        Author lowAuthor = new Author(2, "LowAuthor", "lowauthor@codecool.com");
        Author unknownAuthor = new Author();

/*        List<Author> authors = new ArrayList<>();

        authors.add(proAuthor);
        authors.add(lowAuthor);
        authors.add(unknownAuthor);*/

        List<Author> authors = new ArrayList<>(Arrays.asList(proAuthor, lowAuthor, unknownAuthor));

/*        for (int i = 0; i < authors.size(); i++) {
            System.out.println(i + 1 + ": " + authors.get(i));
        }*/

        for (Author author : authors) {
            System.out.println(authors.indexOf(author) + 1 + ": " + author);
        }

        int authorId = scanner.nextInt();

        if (authorId > authors.size() || authorId < 1) {
            System.out.println("You are liar");
            return;
        }

        Author selectedAuthor = authors.get(authorId - 1);
        selectedAuthor.setUserName(selectedAuthor.getUserName() + " (selected)");

        Task task = new Task(title, description, estimation, selectedAuthor);
        board.addNewTask(task);
        board.showAllTasks();
    }
}