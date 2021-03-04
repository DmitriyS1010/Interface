package Task4;

public class Trousers extends Clothes implements IWomensClothing,IMensClothing{
    public Trousers(Size size, String color) {
        super(size, color);
    }

    public Trousers(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
