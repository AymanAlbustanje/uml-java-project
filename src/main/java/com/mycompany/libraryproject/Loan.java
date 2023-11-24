/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Student student;
    private LocalDate dueDate;

    public Loan(Book book, Student student, LocalDate dueDate) {
        this.book = book;
        this.student = student;
        this.dueDate = dueDate;
    }

    // Getters and setters
}

