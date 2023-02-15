package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();


   /*     //Zofka nakresli se prasatko
        prasatko(zofka);

        //Zofka se presune na novou pozici a nakresli osmiuhelnik
        zofka.setLocation(200, 200);
        nUhelnik(zofka, 50, 8);


        //Zofka se presune na novou pozici a nakresli kolecko
        zofka.setLocation(400, 200);
        nUhelnik(zofka, 10, 36);

        //Zofka se presune na novou pozici a nakreslí slunicko
        zofka.setLocation(600, 200);
        nakresliSlunicko(zofka, 10);*/

        //Zofka se presune na novou pozici a nakresli sluníčko
        zofka.setLocation(150, 60);
        nakresliSlunicko(zofka, 5);

        //Zofka se presune na novou pozici a nakresli prvni radu domecku
        zofka.setLocation(120, 350);
        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.penDown();
        }
        //Zofka se presune na novou pozici a nakresli druhou radu domecku
        zofka.setLocation(120, 650);
        nakresliDomecek(zofka);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(600);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek(zofka);

        //Zofka se presune na novou pozici a nakresli prasatko
        zofka.setLocation(470, 500);
        novePrasatko(zofka);

        //Zofka se presune na novou pozici a napise moje jmeno
        zofka.setLocation(500, 800);
        nakresliI(zofka);
        nakresliV(zofka);
        nakresliA(zofka);
        nakresliN(zofka);
        nakresliA(zofka);

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
        double uhel = 360.0 / 36;
        for (int i = 0; i < 12; i++) {


            for (int j = 0; j < 3; j++) {
                zofka.move(delkaStrany);
                zofka.turnRight(uhel);

            }
            zofka.turnLeft(90);
            zofka.move(20);
            zofka.turnLeft(180);
            zofka.move(20);
            zofka.turnLeft(90);
        }

    }

    void nakresliI(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);

    }

    private void nakresliV(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(70);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(140);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(100);

        zofka.penUp();
        zofka.turnLeft(70);
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    void nakresliA(Turtle zofka) {
        zofka.turnRight(20);
        zofka.move(100);
        zofka.turnRight(140);
        zofka.move(50);
        zofka.turnRight(110);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(70);
        zofka.move(50);

        zofka.penUp();
        zofka.turnLeft(70);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();

    }

    private void nakresliN(Turtle zofka) {
        zofka.move(100);
        zofka.turnRight(145);
        zofka.move(120);
        zofka.turnLeft(145);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private static void novePrasatko(Turtle zofka) {
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

        for (int i = 0; i < 8; i++) {
            zofka.move(8);
            zofka.turnRight(20);
        }
        for (int j = 0; j < 7; j++) {
            zofka.move(5);
            zofka.turnRight(25);

        }
        zofka.setLocation(100, 100);
        zofka.turnLeft(20);
    }


}

