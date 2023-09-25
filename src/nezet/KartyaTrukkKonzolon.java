package nezet;

import java.util.Scanner;
import modell.Lap;
import modell.Pakli;

public class KartyaTrukkKonzolon {

    private final Scanner sc = new Scanner(System.in);
    Pakli pkl;

    public KartyaTrukkKonzolon() {
        pkl = new Pakli();
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            pkl.kever(oszlop);
        }
        ezVolt();

    }

    public void kirak() {
        Lap[] pakliTomb = this.pkl.getPakli();
        for (int i = 1; i < pakliTomb.length; i++) {
            System.out.printf("%-8s", pakliTomb[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

    public void ezVolt() {
        System.out.println("A választott lap: " + pkl.getPakli()[11]);
    }

}
