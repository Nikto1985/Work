package by.kursy.buyel.javalessons.lesson18.ooptask.controller;

import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Flower;
import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Rose;

public class Main {
    public static void main(String[] args) {
        Rose[] flowers = new Rose[10];
        double total = 0;
        for (int i = 0; i < flowers.length; i++) {
            total +=flowers[i].getPrice();
        }



    }
}
