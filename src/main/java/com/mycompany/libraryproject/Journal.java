/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

public class Journal extends Book {
    private String conferenceName;
    private int conferenceNo;

    public Journal(String title, BookAuthor author, int number, String genre, String version, String date,
                   String conferenceName, int conferenceNo) {
        super(title, author, number, genre, version, date);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nConference Name: " + conferenceName + "\nConference No: " + conferenceNo;
    }
}

