package com.codecool;

public class Author {
    private int id;

    private String userName;

    private String email;

    public Author(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Author() {
        this.id = 0;
        this.userName = "unknown";
        this.email = "unknown@unknown.pl";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author name: " + userName;
    }
}
