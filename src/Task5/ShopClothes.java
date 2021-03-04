package Task5;

import Task4.*;

import java.util.Arrays;


public class ShopClothes {

    public static double sumMoney=0;
    public static Clothes[] clothes;
    public static int count;

    public static Clothes[] skirtOnly = new Clothes[8];
    public static int arrayCountSkirt = 0;

    public static Clothes[] teeShortOnly = new Clothes[8];
    public static int arrayCountTeeShort = 0;

    public static Clothes[] tieOnly = new Clothes[8];
    public static int arrayCountTie = 0;

    public static Clothes[] trousOnly = new Clothes[8];
    public static int arrayCountTrous = 0;

    public static Clothes[] busket = new Clothes[10];


    public static int countBusket=0;

    public static void addToBusket(Clothes clothes) {

        busket[countBusket]=clothes;

      //  System.out.println(Arrays.toString(busket));
        for (int i = 0; i <busket.length ; i++) {
            if (busket[i]!=null){
                System.out.println(busket[i]);

            }
        }
        countBusket++;
        sumMoney=sumMoney+clothes.getCost();

    }

    public static void allGoods() {
        count = 1;

        clothes = new Clothes[]{
                new TeeShirt(Size.XS, "темно-серый", 350),
                new TeeShirt(Size.L, "черный", 250),
                new Trousers(Size.M, "голубой", 500),
                new Trousers(Size.XXS, "синий", 225),
                new Skirt(Size.S, "розовый", 400),
                new Skirt(Size.M, "красный", 520),
                new Tie(Size.M, "синий", 300),
                new Tie(Size.L, "красный", 280),
                new TeeShirt(Size.XXL, "серый", 600),
                new TeeShirt(Size.S, "белый", 320),
                new Trousers(Size.XXS, "зеленый", 900),
                new Trousers(Size.XXL, "черный", 2100),
                new Skirt(Size.L, "белый", 900),
                new Skirt(Size.XS, "желтый", 380),
                new Tie(Size.XL, "черный", 450),
                new Tie(Size.S, "синий", 220),
                new TeeShirt(Size.M, "черный", 460),
                new TeeShirt(Size.S, "розовый", 780),
                new Trousers(Size.XXS, "зеленый", 600),
                new Trousers(Size.XXL, "серый", 200),
                new Skirt(Size.XL, "красный", 1100),
                new Skirt(Size.XS, "синий", 1500),
                new Tie(Size.XXS, "оранжевый", 320),
                new Tie(Size.XXL, "салатовый", 450),
                new TeeShirt(Size.L, "фиолетовый", 800),
                new TeeShirt(Size.M, "черный", 450),
                new Trousers(Size.M, "желтый", 1450),
                new Trousers(Size.XL, "коричневый", 1520),
                new Skirt(Size.S, "бежевый", 2150),
                new Skirt(Size.M, "зеленый", 650),
                new Tie(Size.XS, "оранжевый", 450),
                new Tie(Size.XXL, "голубой", 500),

        };


        for (int i = 0; i < clothes.length; i++) {
            System.out.println(count + ". " + clothes[i]);
            count++;
        }
        count = 1;
    }

    public static void skirtOnly() {
        int a = 1;
        System.out.println("Юбки (в наличии):");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof Skirt) {

                skirtOnly[arrayCountSkirt] = clothes[i];

                System.out.println(a + ". " + skirtOnly[arrayCountSkirt]);
                a++;
                arrayCountSkirt++;
            }

        }

    }

    public static void teeShortOnly() {

        int a = 1;
        System.out.println("Футболки (в наличии):");

        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof TeeShirt) {

                teeShortOnly[arrayCountTeeShort] = clothes[i];

                System.out.println(a + ". " + teeShortOnly[arrayCountTeeShort]);
                a++;
                arrayCountTeeShort++;
            }

        }

    }

    public static void tieOnly() {

        int a = 1;
        System.out.println("Галстуки (в наличии):");

        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof Tie) {

                tieOnly[arrayCountTie] = clothes[i];

                System.out.println(a + ". " + tieOnly[arrayCountTie]);
                a++;
                arrayCountTie++;
            }

        }
    }

    public static void trousersOnly() {

        int a = 1;
        System.out.println("Штаны (в наличии):");

        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof Trousers) {

                trousOnly[arrayCountTrous] = clothes[i];

                System.out.println(a + ". " + trousOnly[arrayCountTrous]);
                a++;
                arrayCountTrous++;
            }

        }
    }


}
