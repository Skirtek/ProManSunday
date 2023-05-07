package com.codecool;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private int estimatedHours;
    private Status status;
    private Author author;
    private LocalDateTime creationDate;

    public Task(String title, String description, int estimatedHours, Author author) {
        this.title = title;
        this.description = description;
        this.estimatedHours = estimatedHours;
        this.author = author;

        this.status = Status.NEW;
        this.creationDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", status=" + status +
                ", author=" + author +
                ", creationDate=" + creationDate +
                '}';
    }
}