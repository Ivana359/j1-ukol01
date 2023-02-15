package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();


        //Nakresli prasatko
        prasatko(zofka);

        //zofka se presune na novou pozici a nakresli osmiuhelnik
        zofka.setLocation(200, 200);
        nUhelnik(zofka, 50, 8);


        //zofka se presune na novou pozici a nakresli kolecko
        zofka.setLocation(400, 200);
        nUhelnik(zofka, 10, 36);

        //zofka se presune na novou pozici a nakreslí slunicko
        zofka.setLocation(600, 200);
        nakresliSlunicko(zofka, 10);


    }


    private static void nUhelnik(Turtle zofka, double strana, double pocetStran) {
        double uhel = 360 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(strana);
            zofka.turnRight(uhel);

        }


    }

    public static void main(String[] args) {
        new HlavniProgram().start();

    }

    private static void prasatko(Turtle zofka) {
        zofka.turnLeft(90);
        nakresliDomecek(zofka);
        zofka.turnLeft(90);
        zofka.move(100);

        nozicky(zofka);

        zofka.move(150);
        zofka.turnLeft(90);

        nozicky(zofka);

        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnRight(180);
    }

    private static void nozicky(Turtle zofka) {
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(45);
    }

    private static void nakresliDomecek(Turtle zofka) {
        nakresliObdelnik(zofka);
        zofka.move(150);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(30);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
    }

    private static void nakresliObdelnik(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);

        }
    }

    private void nakresliSlunicko(Turtle zofka, double delkaStrany) {
        double uhel = 360.0 / 27;
        for (int i = 0; i < 9; i++) {


            for (int j = 0; j < 3; j++) {
                zofka.move(delkaStrany);
                zofka.turnRight(uhel);

            }
            zofka.turnLeft(90);
            zofka.move(50);
            zofka.turnLeft(180);
            zofka.move(50);
            zofka.turnLeft(90);
        }

    }
    }

