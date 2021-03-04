package Task2;

public class Guitar implements I_Instrument {

    private int quantityStrings;


    public Guitar(int quantityStrings) {
        this.setQuantityStrings(quantityStrings);
    }

    public int getQuantityStrings() {
        return quantityStrings;
    }

    public void setQuantityStrings(int quantityStrings) {
        this.quantityStrings = quantityStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет "+ this.quantityStrings +" струнная Гитара");
    }

}
