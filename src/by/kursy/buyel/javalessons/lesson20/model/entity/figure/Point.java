package by.kursy.buyel.javalessons.lesson20.model.entity.figure;

import by.kursy.buyel.javalessons.lesson20.model.entity.abstracts.Figure;

public class Point extends Figure {
    public Point(){
       super();
    }

    public Point(int x, int y){
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Point is being drawn...");
    }
}
