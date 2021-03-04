package Task3;

public enum Seasons {

    SPRING(8),
    SUMMER(30) {
        public void getDescription() {
            System.out.println("Теплое время года");
        }
    },
    AUTUMN(14),
    WINTER(-5);


    public void getDescription() {
        System.out.println("Холодное время года");
    }

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    private double averageTemperature;

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public void season(Seasons seasons){
        switch (seasons){
            case SUMMER:
                System.out.println("я люблю лето");
                break;
            case WINTER:
                System.out.println("я люблю зиму");
                break;
            case AUTUMN:
                System.out.println("я люблю осень");
                break;
            case SPRING:
                System.out.println("я люблю весну");
                break;
            default:
                System.out.println();
                break;
        }


    }


    @Override
    public String toString() {
        return   "{" +
                "averageTemperature = " + averageTemperature +
                '}';
    }
}
