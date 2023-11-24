/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

public class Student extends Person {
    private String studentID;
    private String major;

    public Student(String studentID, String ID, String name, String address, String birthDate, String major) {
        super(ID, name, address, birthDate);
        this.studentID = studentID;
        this.major = major;
    }

    // Getters and setters
}

