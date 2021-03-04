package Task1;

public class Magazine implements IPrintable {

    private String nameOfMagazine;


    public Magazine(String nameOfMagazine) {
        this.setNameOfMagazine(nameOfMagazine);
    }

    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + nameOfMagazine);
    }

    public static void printMagazines(IPrintable[] printable) {

        for (int i = 0; i <printable.length ; i++) {
            if (printable[i] instanceof Magazine){

                System.out.println(((Magazine) printable[i]).getNameOfMagazine()+ " является членом класса Журнал");

            }


        }



    }

    @Override
    public String toString() {
        return "Magazine{" +
                "nameOfMagazine='" + nameOfMagazine + '\'' +
                '}';
    }
}
