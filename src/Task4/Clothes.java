package Task4;

import java.util.Objects;

public abstract class Clothes {

    private Size size;
    private String color;
    private double cost;


    public Clothes(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothes(Size size, String color, double cost) {
        this(size, color);
        this.cost = cost;
    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Double.compare(clothes.cost, cost) == 0 && size == clothes.size && Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, cost);
    }
}
