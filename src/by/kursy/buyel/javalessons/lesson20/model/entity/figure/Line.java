package by.kursy.buyel.javalessons.lesson20.model.entity.figure;

import by.kursy.buyel.javalessons.lesson20.model.entity.abstracts.Figure;

public class Line extends Figure {
    private double length;
    public Line(){

    }
    public Line(int x, int y){
        super(x, y);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {


            this.length = length;
        }
    }

    public Line (int x, int y, double length){
        super(x, y);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Line is being draw");
    }
}
