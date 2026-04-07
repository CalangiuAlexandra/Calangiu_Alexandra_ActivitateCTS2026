package Main;

import classes.FabricaPacienti;
import classes.IPacient;
import classes.Internare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();

        IPacient p1 = fabrica.getPacient("Alexandra", "074", "Bucuresti");
        IPacient p2 = fabrica.getPacient("Damian", "0000", "Bucuresti");

        p1.afiseazaInternare(new Internare(1, 10, 5));
        p2.afiseazaInternare(new Internare(2, 5, 3));
    }
}
