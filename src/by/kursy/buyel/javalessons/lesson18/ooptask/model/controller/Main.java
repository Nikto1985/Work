package by.kursy.buyel.javalessons.lesson18.ooptask.model.controller;

import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Flower;
import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Rose;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Rose();
        Rose rose = (Rose) flower;



    }
}
