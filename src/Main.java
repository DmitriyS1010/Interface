import Task1.Book;
import Task1.IPrintable;
import Task1.Magazine;
import Task1.Printable;
import Task2.Drum;
import Task2.Guitar;
import Task2.I_Instrument;
import Task2.Trumpet;
import Task3.Seasons;
import Task4.*;
import Task5.ShopClothes;
import Task5.User;

import java.util.Locale;
import java.util.Scanner;

import static Task5.ShopClothes.*;


public class Main {
    public static int nextChoise;

    public static void main(String[] args) {
        Task5();
        //  Task4();
        // Task3();
        // Task2();
        //  Task1();
    }

    private static void Task5() {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите логин");
//        String login = scanner.nextLine();
//        System.out.println("Введите пароль");
//        String pass = scanner.nextLine();

        String logUser = "user";
        String passUser = "user";

        User user = new User();
        if (user.autentificate(logUser, passUser)) {

            do {

                System.out.println("Полный каталог товаров");
                ShopClothes.allGoods();

                System.out.println("Желаете ли вы посмотреть определенный каталог товаров?    1-ДА ;     2-выбрать в корзину из полного каталога ");
                int a = scanner.nextInt();
                if (a == 1) {


                    System.out.println("1 - юбка ;  2 - футболка ; 3 -галстук ; 4- штаны");
                    int b = scanner.nextInt();

                    switch (b) {
                        case 1:
                            ShopClothes.skirtOnly();
                            System.out.println("выберите номер товара ");
                            int c = scanner.nextInt();

                            System.out.println("Товар в корзине :");

                            ShopClothes.addToBusket(skirtOnly[c - 1]);


                            break;
                        case 2:
                            ShopClothes.teeShortOnly();
                            System.out.println("выберите номер товара ");
                            int d = scanner.nextInt();

                            System.out.println("Товар в корзине :");

                            ShopClothes.addToBusket(teeShortOnly[d-1]);





                            break;
                        case 3:

                            ShopClothes.tieOnly();

                            System.out.println("выберите номер товара ");
                            int e = scanner.nextInt();

                            System.out.println("Товар в корзине :");

                            ShopClothes.addToBusket(tieOnly[e - 1]);
                            break;
                        case 4:

                            ShopClothes.trousersOnly();
                            System.out.println("выберите номер товара ");
                            int f = scanner.nextInt();

                            System.out.println("Товар в корзине :");

                            ShopClothes.addToBusket(trousOnly[f-1]);

                            break;


                    }

                } else if (a==2){
                    System.out.println("выберите номер товара ");
                    int c = scanner.nextInt();
                    //  System.out.println("Товар  "+clothes[c-1] + " выбран в корзину");

                    System.out.println("Товар в корзине");
                    ShopClothes.addToBusket(clothes[c - 1]);

                    double cost = clothes[c - 1].getCost();


                }else {
                    System.exit(0);
                }


                System.out.println("Выбрать еще 1 -да  2 -нет");
                nextChoise = scanner.nextInt();

            } while (nextChoise == 1);

            if (nextChoise == 2) {

                System.out.println("С вас " + sumMoney + " грн");

            }

        }


    }

    private static void Task4() {

        Clothes[] clothes = {
                new TeeShirt(Size.XS, "желтый", 580),
                new TeeShirt(Size.L, "черный", 350),
                new Trousers(Size.M, "голубой", 640),
                new Trousers(Size.XXS, "синий", 225),
                new Skirt(Size.S, "розовый", 250),
                new Skirt(Size.M, "красный", 520),
                new Tie(Size.M, "синий", 750),
                new Tie(Size.L, "красный", 280),
        };

        Studio studio = new Studio();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
    }

    private static void Task3() {


        for (Seasons season : Seasons.values()) {
            printInfo(season);
        }

        System.out.println();
        System.out.print("Любимое время года: ");
        printInfo(Seasons.SUMMER);
    }

    public static void printInfo(Seasons season) {
        System.out.printf("%s %s, ", season.name(), season);
        season.getDescription();
    }


    private static void Task2() {

        Guitar guitar = new Guitar(4);
        Guitar guitar1 = new Guitar(5);

        Drum drum = new Drum("маленький");
        Drum drum1 = new Drum("большой");

        Trumpet trumpet = new Trumpet(30);
        Trumpet trumpet1 = new Trumpet(50);

        I_Instrument[] instruments = {guitar, guitar1, drum, drum1, trumpet, trumpet1};

        for (int i = 0; i < instruments.length; i++) {

            instruments[i].play();

        }
    }

    private static void Task1() {

        Book book = new Book("книга 1");
        Book book1 = new Book("книга 2");
        Book book2 = new Book("книга 3");

        Magazine magazine = new Magazine("журнал1");
        Magazine magazine1 = new Magazine("журнал2");
        Magazine magazine2 = new Magazine("журнал3");


        IPrintable[] iPrintables = {book, book1, book2, magazine, magazine1, magazine2};

        for (int i = 0; i < iPrintables.length; i++) {

            iPrintables[i].print();
        }


        Magazine.printMagazines(iPrintables);
        Book.printBooks(iPrintables);

    }


}
