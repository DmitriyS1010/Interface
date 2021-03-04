package Task4;

public class TeeShirt extends Clothes implements IMensClothing,IWomensClothing{


    public TeeShirt(Size size, String color) {
        super(size, color);
    }

    public TeeShirt(Size size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
