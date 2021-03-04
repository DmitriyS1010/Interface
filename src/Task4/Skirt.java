package Task4;

public class Skirt extends Clothes implements IWomensClothing{
    public Skirt(Size size, String color) {
        super(size, color);
    }

    public Skirt(Size size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
