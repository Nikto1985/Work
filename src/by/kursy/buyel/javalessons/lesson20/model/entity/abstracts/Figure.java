package by.kursy.buyel.javalessons.lesson20.model.entity.abstracts;

public class Figure {
    private int x;
    private int y;


    public Figure(){
        x = 0;
        y = 0;
    }

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(){
        System.out.println("Figure is drawing.");
    }

    public String toString(){
        return "x = " + x + ", y = " +y;
    }
}
