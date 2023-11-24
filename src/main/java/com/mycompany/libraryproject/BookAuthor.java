/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

public class BookAuthor extends Person {
    private String authorID;

    public BookAuthor(String authorID, String ID, String name, String address, String birthDate) {
        super(ID, name, address, birthDate);
        this.authorID = authorID;
    }

    // Getters and setters

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

