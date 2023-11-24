/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

public class Magazine extends Book {
    private int issueNo;
    private String releaseDate;

    public Magazine(String title, BookAuthor author, int number, String genre, String version, String date,
                    int issueNo, String releaseDate) {
        super(title, author, number, genre, version, date);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nIssue No: " + issueNo + "\nRelease Date: " + releaseDate;
    }
}

