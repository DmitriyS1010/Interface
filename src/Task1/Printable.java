package Task1;

import java.util.Arrays;

public class Printable {
    IPrintable[] printables;
    int currentPrintableNumber;

    public Printable() {
        printables = new IPrintable[0];
    }

    public Printable(int printableNumber) {
        printables = new IPrintable[printableNumber];

        for (int i = 0; i < printables.length; i++) {
            printables[i] = new IPrintable() {
                @Override
                public void print() {

                }

            };
        }

        currentPrintableNumber = 0;
    }

    public void addPrintable(IPrintable printable) {
        IPrintable[] temp = Arrays.copyOf(printables, printables.length + 1);
        temp[printables.length] = printable;
        this.printables = temp;
    }



   public static void toStr(IPrintable [] printables){
       for (int i = 0; i < printables.length; i++) {

            printables[i].print();
        }


   }



}
