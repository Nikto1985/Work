package by.kursy.buyel.javalessons.lesson25.model;

public class FloppyBox {
    private double value;

    public FloppyBox(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + "" +
                '}';
    }
}
