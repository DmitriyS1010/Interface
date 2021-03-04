package Task2;

public class Drum implements I_Instrument {

    private String size;

    public Drum(String size) {
        this.setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет "+ this.size + " Барабан");
    }
}
