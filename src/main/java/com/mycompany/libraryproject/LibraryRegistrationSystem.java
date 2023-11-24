/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryRegistrationSystem {
    private List<Book> books;
    private List<Student> students;
    private List<Loan> loans;

    public LibraryRegistrationSystem() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void loanBook(Book book, Student student) {
        if (book.inLoan()) {
            System.out.println("Book is already on loan.");
        } else {
            LocalDate dueDate = LocalDate.now().plusDays(5);
            loans.add(new Loan(book, student, dueDate));
            System.out.println("Book loaned successfully. Due date: " + dueDate);
        }
    }

    public String searchBooksByTitle(String title) {
        return "Search result for title: " + title;
    }

    public String searchBooksByNo(int bookNo) {
        // Implementation to search and display books by number
        return "Search result for book number: " + bookNo;
    }

    public String searchBooksByAuthor(String authorName) {
        // Implementation to search and display books by author name
        return "Search result for author: " + authorName;
    }

    public boolean checkBookAvailability(Book book) {
        // Implementation to check if the book is available
        return !book.inLoan();
    }

    public String checkBookLoans(Book book) {
        // Implementation to check loans for a specific book
        return "Loan information for book: " + book.getTitle();
    }
}

