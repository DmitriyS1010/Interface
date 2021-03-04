package Task1;

import java.awt.print.Printable;

public class Book implements IPrintable {

    private String nameOfBook;

    public Book(String nameOfBook) {
        this.setNameOfBook(nameOfBook);
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    @Override
    public void print() {
        System.out.println("Книга " + this.nameOfBook);
    }


    public static void printBooks(IPrintable[] printable) {

        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {

                System.out.println(((Book) printable[i]).getNameOfBook()+ " является членом класса Книга");

            }


        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
}