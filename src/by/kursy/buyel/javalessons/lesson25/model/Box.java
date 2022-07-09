package by.kursy.buyel.javalessons.lesson25.model;

public class Box {
    private int value;

    public Box(int value) {
        this.value = value;
    }

    public Box() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
