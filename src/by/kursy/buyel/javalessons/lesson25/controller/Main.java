package by.kursy.buyel.javalessons.lesson25.controller;

import by.kursy.buyel.javalessons.lesson25.model.Box;
import by.kursy.buyel.javalessons.lesson25.model.Student;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setValue(10);
        int value = box1.getValue();
        System.out.println(box1);


        Student box2 = new Student();
        box2.setAge(17);
        value = box2.getAge();
        System.out.println(box2);
        System.out.println(value);
    }
}
