package by.kursy.buyel.javalessons.lesson16.controller;

import by.kursy.buyel.javalessons.lesson16.model.entity.Student;

//Inicialization
// 1) JVM
// 2) manual
// 3) constructor
public class Main {

    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 10.0, 'm', true);
        System.out.println(student.getInfo());
    }
}
