package Task2;

public class Trumpet implements I_Instrument{

    private int diameter;

    public Trumpet(int diameter) {
        this.setDiameter(diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет Труба с диаметром в "+ diameter + " см");
    }
}
