package main;

import classes.PlataCard;
import classes.PlataCash;
import classes.PlataPachet;
import classes.PlataPayPal;

public class Main {
    public static void main(String[] args) {
        PlataPachet plata = new PlataPachet();

        plata.setMetodaPlata(new PlataCard());
        plata.executaPlata(1000);

        plata.setMetodaPlata(new PlataCash());
        plata.executaPlata(1000);

        plata.setMetodaPlata(new PlataPayPal());
        plata.executaPlata(1000);
    }
}
