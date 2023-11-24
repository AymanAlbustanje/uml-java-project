/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

public class Book implements Display {
    private String title;
    private BookAuthor author;
    private int number;
    private String genre;
    private String version;
    private String date;

    public Book(String title, BookAuthor author, int number, String genre, String version, String date) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.genre = genre;
        this.version = version;
        this.date = date;
    }

    // Getters and setters

    @Override
    public String getInfo() {
        return "Title: " + title + "\nAuthor: " + author.getName() + "\nNumber: " + number
                + "\nGenre: " + genre + "\nVersion: " + version + "\nDate: " + date;
    }

    @Override
    public boolean inLoan() {
        // Logic to check if the book is on loan
        return false;
    }

    String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

