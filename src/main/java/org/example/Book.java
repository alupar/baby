package org.example;

import java.sql.Date;

public class Book implements Displayable {
    private String title;
    private String author;
    private int yearPublished;

    //сеттеры
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //геттеры
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    //реализуем метод display
    @Override
    public void display() {
        System.out.println("Название книги: " + this.title + "\nАвтор: " + this.author + "\nгод издания: " + this.yearPublished);
    }
}
