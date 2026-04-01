package main;

import classes.FabricaDePachete;
import classes.IPachetTuristic;
import classes.Optiuni;

public class Main {
    public static void main(String[] args) {
        FabricaDePachete fabrica = new FabricaDePachete();

        IPachetTuristic p1 = fabrica.getPachet(1, "HotelA", "Grecia", true);
        IPachetTuristic p2 = fabrica.getPachet(1, "HotelA", "Grecia", true);

        p1.descrierePachet(new Optiuni(true, 2));
        p2.descrierePachet(new Optiuni(false, 1));
    }
}
