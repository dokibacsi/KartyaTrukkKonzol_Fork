package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {
    
    private final Scanner sc = new Scanner(System.in);
    Pakli pkl;
 
    public KartyaTrukk() {
        pkl = new Pakli();
        for (int i = 0; i < 3; i++) {
            pkl.kirak();
            int oszlop = melyik();
            pkl.kever(oszlop);
        }
        pkl.ezVolt();
        
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

}
