package by.kursy.buyel.javalessons.lesson20.controller;

import by.kursy.buyel.javalessons.lesson20.model.entity.figure.Triangle;
import by.kursy.buyel.javalessons.lesson20.model.entity.abstracts.Figure;
import by.kursy.buyel.javalessons.lesson20.model.entity.figure.Line;
import by.kursy.buyel.javalessons.lesson20.model.entity.figure.Point;

public class Main {
    public static void testing(Figure[] figures){
        for (Figure figure : figures){
            System.out.println("Perimetr = " );
        }
    }


    public static void main(String[] args) {
        Figure[] figures = {
                new Line(1,1,10),
                new Triangle(2, 1, 3,4,5),
                new Figure(1,1),
                new Point(0,0)
        };
        testing(figures);

    }


}
