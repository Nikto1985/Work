package by.kursy.buyel.javalessons.lesson16.controller;

import by.kursy.buyel.javalessons.lesson16.model.entity.Student;

//Inicialization
// 1) JVM
// 2) manual
// 3) constructor
// 4) fields definishion
// 5)
public class Main {

    public static void main(String[] args) {
//        Student student = new Student("Alex", 20, 10.0, 'm', true);
        Student st1 = new Student();
        Student st2 = new Student("Peter",19,8.9,'m', true);
        System.out.println(st1.hashCode());
        st1.testing();
        System.out.println(st2.hashCode());
        st2.testing();
    }
}
